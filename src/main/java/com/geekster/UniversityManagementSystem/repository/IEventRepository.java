package com.geekster.UniversityManagementSystem.repository;

import com.geekster.UniversityManagementSystem.model.Event;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEventRepository extends CrudRepository {
    @Modifying
    @Query(value = "update Event set Event_name = :eventName where event_id = :eventId",nativeQuery = true)
    void updateEventByEventId(Integer eventId, String eventName);
    @Query(value = "Select * from event order by date ", nativeQuery = true)
    List<Event> getAllEvent();
}
