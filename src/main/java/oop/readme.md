### Ticket 판매 어플리케이션

1. step1 간단한 예제코드 무엇이 문제인가? 소프트웨어 모듈이가져야 하는 세가지 기능 
   모듈: 크기와 상관없이 클래스나 패키지, 라이브러리와 같은 프로그램을 구성하는 요소
   * 모듈의 세가지 목적 
        * 실행 중에 제대로 동작하는 것
        * 변경을 위해 존재하는 것
        * 코드를 읽는 사람과 소통하는 것
    
   이해가능한 코드란 동작이 우리의 예상에서 크게 벗어나지 않는 코드
   
   * 문제점
     * 한가지메서드에서 너무 많은 작업을 진행한다.
     * 커플링이 너무 높아 변경에 취약한 코드
       
   * 해결방법
     * 객체 사이의 결합도를 낮춰 변경이 용이한 설계로 변경해야한다


   * 설계 개선하기
      * 자율성 높이기
         * 설계를 변경하기 어려운이유 theater가 audience, ticketSeller 뿐만 아니라 다른 다양한 개체에 마음대로 접근할수있음.
        

~~~java
//기존코드
    public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
~~~


~~~java
//기존코드
    public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
~~~