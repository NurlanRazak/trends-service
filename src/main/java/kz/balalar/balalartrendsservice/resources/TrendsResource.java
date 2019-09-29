package kz.balalar.balalartrendsservice.resources;

import kz.balalar.balalartrendsservice.models.Trends;
import kz.balalar.balalartrendsservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/trends")
public class TrendsResource {

    @RequestMapping("/{trendId}")
    public Trends getTrendsInfo(@PathVariable("trendId") String trendId) {
        return new Trends("asdfa", "afadsf", "asdfasd");
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Trends> trends = Arrays.asList(
                new Trends("12", "1", "13"),
                new Trends("13", "2", "11")
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(trends);
        return userRating;
    }
}
