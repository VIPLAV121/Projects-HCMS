package com.vip.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TrainingFeedback")
public class TrainingFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FeedbackID")
	private int feedbackId;
	
	@ManyToOne
	@JoinColumn(name="ScheduleID")
	private TrainingSchedules trainingSchedule;
	
	@ManyToOne
	@JoinColumn(name="ParticipantID")
	private Employees participant;
	
	@Column(name="FeedbackComments")
	private String feedbackComments;
	
	@Column(name="StatisfactionRating")
	private int statisfactionRating;
	
	//constructor getters and setters
	
	public TrainingFeedback() {
		// TODO Auto-generated constructor stub
	}

	public TrainingFeedback(int feedbackId, TrainingSchedules trainingSchedule, Employees participant,
			String feedbackComments, int statisfactionRating) {
		super();
		this.feedbackId = feedbackId;
		this.trainingSchedule = trainingSchedule;
		this.participant = participant;
		this.feedbackComments = feedbackComments;
		this.statisfactionRating = statisfactionRating;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public TrainingSchedules getTrainingSchedule() {
		return trainingSchedule;
	}

	public void setTrainingSchedule(TrainingSchedules trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}

	public Employees getParticipant() {
		return participant;
	}

	public void setParticipant(Employees participant) {
		this.participant = participant;
	}

	public String getFeedbackComments() {
		return feedbackComments;
	}

	public void setFeedbackComments(String feedbackComments) {
		this.feedbackComments = feedbackComments;
	}

	public int getStatisfactionRating() {
		return statisfactionRating;
	}

	public void setStatisfactionRating(int statisfactionRating) {
		this.statisfactionRating = statisfactionRating;
	}

	@Override
	public String toString() {
		return "TrainingFeedback [feedbackId=" + feedbackId + ", trainingSchedule=" + trainingSchedule
				+ ", participant=" + participant + ", feedbackComments=" + feedbackComments + ", statisfactionRating="
				+ statisfactionRating + "]";
	}

	
	
}
