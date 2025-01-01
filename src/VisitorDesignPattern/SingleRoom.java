package VisitorDesignPattern;

public class SingleRoom implements IElement {
    private String status;
    SingleRoom(){
        this.status = "Empty";
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
