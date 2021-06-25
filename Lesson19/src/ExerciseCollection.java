import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;


public class ExerciseCollection
{
    ArrayList<Person> people = new ArrayList<>(List.of(
            new Person("Vinh", "Vietnam", 28),
            new Person("Lan", "Vietnam", 24),
            new Person("John", "USA", 27),
            new Person("Lee", "China", 67),
            new Person("Kim", "Korea", 22),
            new Person("Long", "Vietnam", 18),
            new Person("Jungho", "Korea", 19),
            new Person("Tian", "China", 20),
            new Person("Clara", "USA", 40),
            new Person("Mikura", "Japan", 27),
            new Person("Sony", "Japan", 29),
            new Person("Xiang", "China", 78),
            new Person("Peter", "France", 18),
            new Person("Haloy", "Malaysia", 20),
            new Person("Magie", "Malaysia", 32)
            ));
//1.1 Đếm số người theo từng quốc tịch in ra màn hình
    public void Bai1()
    {
        Map<String,Integer> countPeopleByCoutry = new HashMap<>();
        for (Person person : people)
        {
            Integer countPerson = countPeopleByCoutry.get(person.getNationality());
            if(countPerson == null)
                countPeopleByCoutry.put(person.getNationality(), 1);
            else
                countPeopleByCoutry.put(person.getNationality(), countPerson+1);
        }

        for (Map.Entry<String,Integer> entry: countPeopleByCoutry.entrySet())
        {
            System.out.printf("\n- %s"+": %d",entry.getKey(), entry.getValue());
        }
    }

    //1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
    public void Bai2()
    {
        ArrayList<Person> list25 = new ArrayList<>(List.of());
        for (Person person : people)
        {
            if(person.getAge()>25)
            {
                list25.add(person);
            }
        }
        // sort arraylist giảm dần theo tuổi
        var result = list25.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        for (Person person25: result)
        {
            System.out.printf("\n- %s - %s - %d",person25.getName(), person25.getNationality(), person25.getAge());
        }
    }

    //1.3 Tính trung bình tuổi của người theo từng quốc gia
    public void Bai3()
    {
        // group by national=> Map<National,List(Person)>
        Map<String, List<Person>> mapPeopleByNational = new HashMap<>();
        mapPeopleByNational = people.stream().collect(Collectors.groupingBy(w->w.getNationality()));

        for (Map.Entry<String,List<Person>> entry : mapPeopleByNational.entrySet())
        {
            // tính tổng theo nhóm
            int sumAge = 0;
            for ( Person agePerson : entry.getValue())
            {
                sumAge = sumAge+ agePerson.getAge();
            }
            double averageAge = (double) sumAge/entry.getValue().size();
            System.out.printf("\n- %s: %.1f", entry.getKey(), averageAge);
        }
    }

    //1.4 In ra màn hình đánh giá tuổi mỗi người
   /* < 20 tuổi: nổi loạn
    20 đến 30 tuổi: việc làm
    31 đến 40 tuổi: sự nghiệp
    41 trở lên: hưởng thụ*/
    public void Bai4()
    {
        String strDanhGia = "";
        for (Person person : people)
        {
            if(person.getAge() < 20)
                strDanhGia ="nổi loạn";
            else if(person.getAge() >= 20 && person.getAge()<= 30)
                strDanhGia ="việc làm";
            else if(person.getAge()>= 31 && person.getAge() <= 40 )
                strDanhGia ="sự nghiệp";
            else
                strDanhGia ="hưởng thụ";
            System.out.printf("\n- %s - %s - %d - %s",person.getName(), person.getNationality(), person.getAge(), strDanhGia);
        }
    }


}
