package com.example.personxmlinformation;

public class PeopleData {

    private Person [] data = {
            new Person(
                    "Sabin Tabirca",
                    "WBG, UCC, Cork",
                    "12345678",
                    "sabin.jpg",
                    "http://www.cs.ucc.ie"
            ),
            new Person(
                    "Sabinee Tabirca",
                    "WBG, UCC, Cork",
                    "12345678",
                    "sabin.jpg",
                    "http://www.cs.ucc.ie"
            ),
            new Person(
                    "Sabina Tabirca",
                    "WBG, UCC, Cork",
                    "12345678",
                    "sabin.jpg",
                    "http://www.cs.ucc.ie"
            ),
            new Person(
                    "Sabinus Tabirca",
                    "WBG, UCC, Cork",
                    "12345678",
                    "sabin.jpg",
                    "http://www.cs.ucc.ie"
            )
    };

    public Person getPerson(int i){return  data[i];}
    public int getLength(){return data.length;}

    public String[] getNames(){
        //construct the string[]

        String [] names= new String[data.length];
        for (int i=0; i<data.length; i++){
            names[i]= data[i].getName();
        }
        return names;
    }
}
