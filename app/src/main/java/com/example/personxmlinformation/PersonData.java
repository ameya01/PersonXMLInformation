package com.example.personxmlinformation;

public class PersonData {

    private Person data;

    public PersonData(){
        data = new Person(
                "Sabin Tabirca",
                "WBG, UCC, Cork",
                "12345678",
                "sabin.jpg",
                "http://www.cs.ucc.ie"
        );
    }

    public Person getData() {

        return data;
    }
}
