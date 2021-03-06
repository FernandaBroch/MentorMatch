package br.com.dextra.javabootcamp.MentorMatch.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String knowledgeArea;

    private String bio;

    @ManyToMany
    @JsonIgnore
    private List<Mentored> mentored;

    @OneToMany(mappedBy = "mentor")
    @JsonIgnore
    private List<Mentored> likedList;


}
