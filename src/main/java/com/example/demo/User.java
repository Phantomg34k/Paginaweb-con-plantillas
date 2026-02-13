package com.example.demo;

import java.util.List;

public class User {

  private String name;
  private String email;
  private String github;
  private String profilePictureUrl; 
  private List<String> tools;
  private String favoriteFood;
  private String children;
  private String favoriteColor;
  private String hobby;
  private String sport;
  private String city;
  private String career;
  private String university;
  private int age;
  private String pet;
  
  public User() {

  }

  public User(String name, String email, String github, List<String> tools) {
    setName(name);
    setEmail(email);
    setGithub(github);
    setTools(tools);
  }

  public void setGithub(String github) {
    this.github = github;
  }

  public void setTools(List<String> tools) {
    this.tools = tools;
  }

  public List<String> getTools() {
    return tools;
  }

  public String getGithub() {
    return github;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

 

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }	 public String getProfilePictureUrl() {
	    return profilePictureUrl;
	}

	public void setProfilePictureUrl(String profilePictureUrl) {
	    this.profilePictureUrl = profilePictureUrl;
	}

	public String getFavoriteFood() {
	    return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
	    this.favoriteFood = favoriteFood;
	}

	public String getChildren() {
	    return children;
	}

	public void setChildren(String children) {
	    this.children = children;
	}

	public String getFavoriteColor() {
	    return favoriteColor;
	}

	public void setFavoriteColor(String favoriteColor) {
	    this.favoriteColor = favoriteColor;
	}

	public String getHobby() {
	    return hobby;
	}

	public void setHobby(String hobby) {
	    this.hobby = hobby;
	}

	public String getSport() {
	    return sport;
	}

	public void setSport(String sport) {
	    this.sport = sport;
	}

	public String getCity() {
	    return city;
	}

	public void setCity(String city) {
	    this.city = city;
	}

	public String getCareer() {
	    return career;
	}

	public void setCareer(String career) {
	    this.career = career;
	}

	public String getUniversity() {
	    return university;
	}

	public void setUniversity(String university) {
	    this.university = university;
	}

	public int getAge() {
	    return age;
	}

	public void setAge(int age) {
	    this.age = age;
	}

	public String getPet() {
	    return pet;
	}

	public void setPet(String pet) {
	    this.pet = pet;
	}


}