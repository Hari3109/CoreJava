package com.cg.AmusementParkTicketbooking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.AmusementParkTicketbooking.Repository.ActivityRepository;
import com.cg.AmusementParkTicketbooking.entities.Activity;
import com.cg.AmusementParkTicketbooking.serviceImpl.ActivityServiceImpl;

@SpringBootTest
class AmusementParkTicketbookingApplicationTests {
   @InjectMocks
   ActivityServiceImpl service;
   @Mock
   ActivityRepository rep;
	@Test
	
	void contextLoads() {
	}
	@Test
	 public void testAddActivity() {
        Activity activity = new Activity();
        activity.setActivityName("Roller Coaster");
        activity.setAvailableSeats(45);
        activity.setActivityId(2);
        activity.setPrice(100);
        Mockito.when(rep.save(Mockito.any(Activity.class))).thenReturn(activity);
        Activity savedActivity = service.addActivity(activity);
        assertNotNull(savedActivity);
        assertEquals(activity.getActivityName(), savedActivity.getActivityName());
        assertEquals(activity.getActivityId(), savedActivity.getActivityId());
        assertEquals(activity.getAvailableSeats(), savedActivity.getAvailableSeats());
        assertEquals(activity.getPrice(), savedActivity.getPrice(), 0.0f);
    }
	@Test
	public void testUpdateActivity() {
		int activityId=1;
		Activity existingActivity = new Activity();
		existingActivity.setActivityId(activityId);
		existingActivity.setActivityName("Haunted House");
		existingActivity.setAvailableSeats(45);
		existingActivity.setPrice(80);
		Activity updatedActivity = new Activity();
        updatedActivity.setActivityId(activityId);
        updatedActivity.setActivityName("");
		
	}
}
