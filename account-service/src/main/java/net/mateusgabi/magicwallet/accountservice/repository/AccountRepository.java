package net.mateusgabi.magicwallet.accountservice.repository;

import net.mateusgabi.magicwallet.accountservice.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {
    Account findByUsername(String username);
}
