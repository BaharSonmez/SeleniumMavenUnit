package day14_FakerClass_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_Faker {
    @Test
    public void faker () {

        //1.Faker objesi olustururuz

        Faker faker = new Faker();
        //YADA Faker.instance () methodu ile de kullanabiliriz
        //Faker faker= Faker.instance();
        //Faker.instance();

        //Firstname yazdirlaim
        System.out.println("Fake first name :" + faker.name().firstName());

        //Last name yazdiralim
        System.out.println(faker.name().lastName());

        //Kullanici adi yazdiralim
        System.out.println(faker.name().username());

        //Meslek ismi
        System.out.println(faker.name().title());

        //Sehir ismi

        System.out.println(faker.address().city());
        //Ulke ismi
        System.out.println(faker.address().country());

        //adrerss yazdiralim
        System.out.println(faker.address().fullAddress());

        //telefon numarasi yazdiralim
        System.out.println(faker.phoneNumber().cellPhone());

        //Zip code
        System.out.println(faker.address().zipCode());

        //Rastgele 15 haneli bir numara
        System.out.println(faker.number().digits(15));


    }
}
