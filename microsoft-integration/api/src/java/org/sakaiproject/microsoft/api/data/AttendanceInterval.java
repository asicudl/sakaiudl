package org.sakaiproject.microsoft.api.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.Instant;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttendanceInterval {
	public String joinDateTime;
	public String leaveDateTime;
	public int durationInSeconds;

	public String getJoinDateTime() { return joinDateTime; }
	public void setJoinDateTime(String joinDateTime) { this.joinDateTime = joinDateTime; }

	public String getLeaveDateTime() { return leaveDateTime; }
	public void setLeaveDateTime(String leaveDateTime) { this.leaveDateTime = leaveDateTime; }

	public int getDurationInSeconds() { return durationInSeconds; }
	public void setDurationInSeconds(int durationInSeconds) { this.durationInSeconds = durationInSeconds; }
}

