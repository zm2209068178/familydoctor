package mum.waa.fd.app.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import mum.waa.fd.app.util.FamilyDoctorConstants;

public class PatientAccount extends Account {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int patientId;

	@NotBlank(message = FamilyDoctorConstants.EMPTY_VALIDATION)
	@Size(min = 4, max = 4, message = FamilyDoctorConstants.EXACTLY_DIGITS_VALIDATION)
	@Column(name = "SSN")
	private String ssn;

	@Valid
	private AppointmentRecord appointmentRecord;

	public PatientAccount(String firstName, String lastName, String phone, String email, String password,
			Address address, String ssn) {
		super(firstName, lastName, phone, email, password, address);
		this.ssn = ssn;
		appointmentRecord = new AppointmentRecord(this);
	}

	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the ssn
	 */
	public String getSSN() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the appointmentRecord
	 */
	public AppointmentRecord getAppointmentRecord() {
		return appointmentRecord;
	}

	/**
	 * @param appointmentRecord
	 *            the appointmentRecord to set
	 */
	public void setAppointmentRecord(AppointmentRecord appointmentRecord) {
		this.appointmentRecord = appointmentRecord;
	}
}
