package thaitd.cicd.jenkins.service;

import thaitd.cicd.jenkins.model.Account;
import thaitd.cicd.jenkins.payload.AccountCreateRequest;

import java.util.List;

public interface AccountService {
    Account createAccount(AccountCreateRequest request);

    Account updateAccount();

    Account deleteAccount();

    Account getAccount(int id);

    List<Account> getListAccount();
}
