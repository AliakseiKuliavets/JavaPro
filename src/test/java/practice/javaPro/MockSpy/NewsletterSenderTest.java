package practice.javaPro.MockSpy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewsletterSenderTest {
    private MessagingEngine messagingEngine;
    private SubscribersDatabase subscribersDatabase;
    private NewsletterSender newsletterSender;



    @Test
    void NewsletterSenderConstructorAssignsDatabase() {
        messagingEngine = Mockito.mock(MessagingEngine.class);
        subscribersDatabase = new SubscribersDatabase();
        newsletterSender = new NewsletterSender(subscribersDatabase, messagingEngine);
        assertEquals(subscribersDatabase, newsletterSender.getSubscribersDatabase());
    }

    @Test
    void numberOfSubscribersPositiveTest() {
        subscribersDatabase = Mockito.mock(SubscribersDatabase.class);
        messagingEngine = Mockito.mock(MessagingEngine.class);

        newsletterSender = new NewsletterSender(subscribersDatabase, messagingEngine);

        List<String> subscribersList = Arrays.asList("email1","email2","email3");

        Mockito.when(subscribersDatabase.getSubscribers()).thenReturn(subscribersList);

        Assertions.assertEquals(3,newsletterSender.numberOfSubscribers());
    }
    @Test
    void zeroSubscribersThrownTest(){
        newsletterSender = new NewsletterSender(new SubscribersDatabase(), new MessagingEngine());
        NewsletterSender newsletterSenderSpy = Mockito.spy(newsletterSender);

        Mockito.when(newsletterSenderSpy.numberOfSubscribers()).thenReturn(0);
        Assertions.assertThrows(ZeroSubscribersException.class, () -> newsletterSenderSpy.sendNewsletter("Subject"));
    }
}