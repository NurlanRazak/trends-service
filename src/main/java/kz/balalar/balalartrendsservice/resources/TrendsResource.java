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
        return new Trends("asdfa", "afadsf", "asdfasd", "Photography, Art", "product, audio file, good");
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Trends> trends = Arrays.asList(
                new Trends("12", "1", "13", "2,136", "5,9"),
                new Trends("13", "1322", "11", "112,14", "10324,121"),
                new Trends("23", "232", "11435", "12,13214", "10122,3211"),
                new Trends("43", "212", "1142", "12,1314", "10132,1134"),
                new Trends("153", "1232", "11123", "123412,14", "113240,14311"),
                new Trends("613", "2321", "11314", "12,4314", "10413,114132"),
                new Trends("113", "254", "11143", "182,1564", "1041,113241")

        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(trends);
        return userRating;
    }
}
