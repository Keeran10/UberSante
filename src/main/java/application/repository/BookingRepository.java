package application.repository;

import application.model.Appointment;

import application.model.Booking;
import application.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

    Collection<Booking> findByPatient(Patient patient);
}
