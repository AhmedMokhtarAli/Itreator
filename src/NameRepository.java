public class NameRepository implements Container {
    public String names[] = {"ahmed", "mohammed", "kareem"};

    @Override
    public Itreator getItreator() {
        return new NameItreator();
    }

    private class NameItreator implements Itreator {
        int index;

        @Override
        public boolean hasNet() {
            if (index <names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNet()){
                return names[index++];
            }
            return null;
        }
    }
}