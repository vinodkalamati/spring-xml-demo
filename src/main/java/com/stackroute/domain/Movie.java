package com.stackroute.domain;

@Component
public class Movie {

    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void getdetails() {
        System.out.println(
                " actorName= " + actor.getName() +" age= "+actor.getAge()+" gender= "+actor.getGender());
    }
}
