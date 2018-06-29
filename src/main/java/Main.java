import com.google.gson.Gson;

public class Main extends Person {
    public static void main(String[] args) {

        Person Janusz;

        {
            Janusz = new Person();
            Janusz.name = "Janusz";
            Janusz.surname = "Grażyna";
            Janusz.age = 44;
            Janusz.height = 167;
            Janusz.hobby = "Somsiad";
        }

        {
            Gson json = new Gson();

            String response = json.toJson(Janusz);
            System.out.println(response);

            Person Janusz1 = json.fromJson(response, Person.class);
            System.out.println(Janusz1.getName()+ Janusz1.getAge());

        }

    }
}
