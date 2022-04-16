package oop.step1.ticket_application;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        //캡슐화
        //캡슐화의 목적은 변경하기 쉬운 객체를 만드는 것.
       ticketSeller.sellTo(audience);
    }
}
