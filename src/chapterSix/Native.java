package chapterSix;

public class Native {


        private int scvId;
        private String name;

        public Native(String name,int scvId){
            this.name = name;
            this.scvId = scvId;
        }

    public int getScvId() {
        return scvId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScvId(int scvId) {
        this.scvId = scvId;
    }
}

