package practice.javaPro.enums;

import lombok.Getter;

public class Main {
    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        subscription.state = Subscription.State.SUSPENDED;
        System.out.println(Subscription.State.valueOf("ACTIVE"));
        System.out.println(Subscription.State.NONE.toString());
        System.out.println(Subscription.State.SUSPENDED.ordinal());
        System.out.println(Subscription.State.values()[2]);

        switch (subscription.state) {
            case NONE:
                break;
            case ACTIVE:
                break;
            case SUSPENDED:
                break;
            default:
                System.out.println("-1");
        }
    }
}

class  Subscription {
    public String name;
    public String description;
    State state;
    enum State {
        NONE,
        ACTIVE,
        SUSPENDED;
    }
}


