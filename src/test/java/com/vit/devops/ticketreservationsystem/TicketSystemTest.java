package com.vit.devops.ticketreservationsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TicketSystemTest {
    
    private Passenger passenger;
    private Ticket ticket;
    private Train train;
    private Payment payment;
    private TicketClerk clerk;

    @BeforeEach
    void setUp() {
        // Initialize objects before each test
        passenger = new Passenger();
        ticket = new Ticket();
        train = new Train();
        payment = new Payment();
        clerk = new TicketClerk();
    }

    // Test Case 1: Verify Passenger Attribute Assignment
    @Test
    public void testPassengerDetails() {
        passenger.Name = "Hemanth";
        passenger.Age = 25;
        assertEquals("Hemanth", passenger.Name);
        assertEquals(25, passenger.Age);
    }

    // Test Case 2: Verify Ticket Routing Information
    @Test
    public void testTicketRouting() {
        ticket.StartingLocation = "Vellore";
        ticket.DestinationLocation = "Bangalore";
        ticket.TicketNo = 12345;
        
        assertEquals("Vellore", ticket.StartingLocation);
        assertEquals("Bangalore", ticket.DestinationLocation);
        assertNotNull(ticket.TicketNo);
    }

    // Test Case 3: Verify Payment Amount Precision
    @Test
    public void testPaymentAmount() {
        payment.Amount = 450.50;
        assertEquals(450.50, payment.Amount, 0.001, "Payment amount should match exactly.");
    }

    // Test Case 4: Verify Train Identification
    @Test
    public void testTrainId() {
        train.TrainId = "EXP-101";
        train.Model = "Shatabdi";
        assertEquals("EXP-101", train.TrainId);
        assertNotNull(train.Model);
    }

    // Test Case 5: Verify Ticket Clerk Information
    @Test
    public void testTicketClerkDetails() {
        clerk.Name = "Officer John";
        clerk.Location = "Counter 1";
        assertEquals("Officer John", clerk.Name);
        assertEquals("Counter 1", clerk.Location);
    }
}