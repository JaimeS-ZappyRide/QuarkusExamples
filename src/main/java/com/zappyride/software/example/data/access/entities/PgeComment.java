package com.zappyride.software.example.data.access.entities;


import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "pge_evc_feedback_messages")
@NamedQuery(name = "PgeComment.findAll", query = "SELECT f FROM PgeComment f")
 public class PgeComment {
     Long id;
     Date created_at;
     Date updated_at;
     UUID uuid;
     String client_ip;
     String current_path;
     String goal;
     Boolean goal_achieved;
     Boolean would_recommend;
     String suggestions;


    public PgeComment(){}


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getClient_ip() {
        return client_ip;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
    }

    public String getCurrent_path() {
        return current_path;
    }

    public void setCurrent_path(String current_path) {
        this.current_path = current_path;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Boolean getGoal_achieved() {
        return goal_achieved;
    }

    public void setGoal_achieved(Boolean goal_achieved) {
        this.goal_achieved = goal_achieved;
    }

    public Boolean getWould_recommend() {
        return would_recommend;
    }

    public void setWould_recommend(Boolean would_recommend) {
        this.would_recommend = would_recommend;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }
}
