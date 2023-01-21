public class ItreatorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();

        for (Itreator itreator=nameRepository.getItreator();itreator.hasNet();){
            String name=(String) itreator.next();
            System.out.println(name);
        }
    }
}
