public class Car {

    private String name;

    public Car(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
/* public void testMethod(int count){
        if (count > 5) {
            count = count+1;
            // test2();
        } else if (count<0){
            count = -10;

        }else {
            count = count+5;
            //test3();
        }

        switch (count){
            case 5:
                test2();
                break;
            case 10:
                test3();
                break;
            default:
        }

        // тернарный условный оператор
        //count = count>0?count+1:count+5;
        System.out.println(count);


    }

    private void test2(){
        System.out.println("test2");
    }
    private void test3(){
        System.out.println("test3");
    }*/
}
