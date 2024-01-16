package interwiev_questions;

public class SingletonClass {

        // private field that refers to the object
        private static SingletonClass singletonObject;

        // Constructor of the DataBase class
        private SingletonClass() {
        }
        public static SingletonClass getlnstance() {
        //Write code that allows us to create only one object

            if(singletonObject == null){

                singletonObject = new SingletonClass();
            }
            //Return the singleton object
            return singletonObject;
        }
/*
 Soru 4: Java'da Singleton Class nedir ve Singleton Class nasıl uygulanır?

 Singleton, bir class ın yalnızca bir nesneye sahip olmasını sağlayan bir tasarım modelidir.

 Bir singleton class ı oluşturmak için, bir class aşağıdaki özellikleri uygulamalıdır:

        1.Class ın dışında nesne oluşturulmasını kısıtlamak için Private Constructor oluşturun.

        2.Tek nesneye atıfta bulunan class level seviyesinde Private bir Variable oluşturun.

        3.Yarattığımız nesneyi oluşturmamızı ve ona erişmemizi sağlayan bir public statik yöntem oluşturun.

 Yöntemin içinde, birden fazla nesne oluşturmamızı kısıtlayan bir koşul oluşturacağız.

 */

}
