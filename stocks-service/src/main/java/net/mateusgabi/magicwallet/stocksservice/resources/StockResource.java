package net.mateusgabi.magicwallet.stocksservice.resources;

import net.mateusgabi.magicwallet.stocksservice.models.Stock;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stocks")
public class StockResource {

    @RequestMapping("/{ticker}")
    public Stock getStockDetails(@PathVariable("ticker") String ticker) {
        return new Stock(ticker, "My company foo");
    }
}
