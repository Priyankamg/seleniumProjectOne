package com.Priyanka.json;


/**
 * Created by Priyanka on 7/27/2016.
 */
public class User {
    private String gender;
    private Name name;

    public class Name {
        private String first;
        private String last;

        public void setFirst(String first) {
            this.first = first;
        }

        public String getFirst() {
            return first;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public String getLast() {
            return last;
        }
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }



}
