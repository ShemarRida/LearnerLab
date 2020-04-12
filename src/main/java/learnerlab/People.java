package learnerlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    List<Person> personList = new ArrayList<>();

    public void add(Person w){
        personList.add(w);
    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (person.getId().equals(id))
                return person;
        }
        return null;
    }

    public Boolean contains(Person w){
        for (Person person : personList){
            if (person.equals(w))
                return true;
        }
        return false;
    }

    public void remove(Person w){
        if(contains(w))
            personList.remove((int)getIndexOf(w));
    }
    public void remove(Long id){
        Person w = findById(id);
        if (w != null)
            personList.remove((int)getIndexOf(w));
    }
    public Integer getIndexOf(Person w){
        for (int r = 0; r < personList.size(); r++){
            if (personList.get(r).equals(w))
                return r;
        }
        return -1;
    }
    public void removeAll(){
        personList.clear();
    }
    public Integer count(){
        return personList.size();
    }
    public Person[] toArray(){
        Person[] res = (Person[])personList.toArray();
        return res;
    }


    public Iterator iterator(){
        return personList.iterator();
    }
}
