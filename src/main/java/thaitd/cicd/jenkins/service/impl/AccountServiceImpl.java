package thaitd.cicd.jenkins.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thaitd.cicd.jenkins.model.Account;
import thaitd.cicd.jenkins.model.Role;
import thaitd.cicd.jenkins.payload.AccountCreateRequest;
import thaitd.cicd.jenkins.repository.AccountRepository;
import thaitd.cicd.jenkins.repository.RoleRepository;
import thaitd.cicd.jenkins.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Account createAccount(AccountCreateRequest request) {
        Role role = roleRepository.findById(request.getRole()).get();
        Account account = Account.builder()
                .email(request.getEmail())
                .name(request.getName())
                .role(role)
                .build();
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount() {
        return null;
    }

    @Override
    public Account deleteAccount() {
        return null;
    }

    @Override
    public Account getAccount(int id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public List<Account> getListAccount() {
        return accountRepository.findAll();
    }
}
