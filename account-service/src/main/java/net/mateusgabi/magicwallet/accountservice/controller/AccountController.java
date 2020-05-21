package net.mateusgabi.magicwallet.accountservice.controller;

import net.mateusgabi.magicwallet.accountservice.domain.Account;
import net.mateusgabi.magicwallet.accountservice.domain.User;
import net.mateusgabi.magicwallet.accountservice.domain.Wallet;
import net.mateusgabi.magicwallet.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public Account create(@RequestBody User user) {
        Account accountExisting = accountRepository.findByUsername(user.getUsername());
        Assert.isNull(accountExisting, "account already exists");

        Account account = new Account(user.getUsername(), List.of(
                new Wallet("abcdefg", "foo")
        ));

        accountRepository.save(account);

        return account;
    }
}
