package thaitd.cicd.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thaitd.cicd.jenkins.model.Account;
import thaitd.cicd.jenkins.payload.ApiResponse;
import thaitd.cicd.jenkins.payload.AccountCreateRequest;
import thaitd.cicd.jenkins.payload.AccountResponse;
import thaitd.cicd.jenkins.service.AccountService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/account")
    private ResponseEntity<?> createAccount(@Valid @RequestBody AccountCreateRequest request) {
        try {
            Account account = accountService.createAccount(request);
            AccountResponse response = AccountResponse.setResponse(account);
            return ResponseEntity.ok(new ApiResponse<>(true, "Account created", response));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new ApiResponse<>(false, ex.getMessage(), null));
        }
    }

    @GetMapping("/account/{id}")
    private ResponseEntity<?> getAccount(@PathVariable("id") int id) {
        try {
            Account account = accountService.getAccount(id);
            AccountResponse response = AccountResponse.setResponse(account);
            return ResponseEntity.ok(new ApiResponse<>(true, "Get account information successful", response));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new ApiResponse<>(false, ex.getMessage(), null));
        }
    }
    @GetMapping("/account")
    private ResponseEntity<?> getAccounts() {
        try {
            List<Account> accounts = accountService.getListAccount();
            List<AccountResponse> response =  accounts.stream().map(AccountResponse::setResponse).collect(Collectors.toList());
            return ResponseEntity.ok(new ApiResponse<>(true, "Get list account successful", response));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new ApiResponse<>(false, ex.getMessage(), null));
        }
    }
}
