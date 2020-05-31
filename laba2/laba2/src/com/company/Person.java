package com.company;
import net.jcip.annotations.Immutable;
import com.google.gson.Gson;

import java.io.*;

@Immutable
class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {return age; }

    public void ToJson(String path)
    {
        Gson gson = new Gson();
        try(FileWriter writer = new FileWriter(path, false))
        {
            String text = gson.toJson(this);
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Person FromJson(String path){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader(path))
        {
            String line="";
            int c;
            while((c=reader.read())!=-1){
                line+=(char)c;
            }
            return gson.fromJson(line, Person.class);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public boolean equals( Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person anotherPerson = (Person) o;
        return Objects.equals(name, anotherPerson.name) && Objects.equals(age, anotherPerson.age) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}