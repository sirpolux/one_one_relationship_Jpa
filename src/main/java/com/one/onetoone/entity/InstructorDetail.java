package com.one.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class InstructorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String youtubeChannel;
    private String hobby;

    public  InstructorDetail(String youtubeChannel, String hobby){
        this.hobby=hobby;
        this.youtubeChannel=youtubeChannel;
    }
}
