package net.mateusgabi.magicwallet.stocksservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

@RestController
@RequestMapping("/stocks")
public class StockResource {

    @RequestMapping("/{ticker}")
    public Stock getStockDetails(@PathVariable("ticker") String ticker) throws IOException {
        Stock yahooFinanceStock = YahooFinance.get(ticker);

        BigDecimal price = yahooFinanceStock.getQuote().getPrice();
        return yahooFinanceStock;
    }
}
