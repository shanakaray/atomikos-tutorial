package com.yr.atomikos.banking.controller;

import com.yr.atomikos.banking.dao.AccountDAO;
import com.yr.atomikos.banking.entity.Account;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.Optional;

@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountDAO accountDAO;

    @GetMapping
    @Operation(summary = "retrieve account details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Account Found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Account.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content),
            @ApiResponse(responseCode = "404", description = "No account found.", content = @Content) })
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Account> getAccount(@RequestParam("account-number") String accountNumber) {
        return  ResponseEntity.of(accountDAO.findById(accountNumber));
    }

    @PostMapping
    @Transactional
    @Operation(summary = "create a new account")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully Created.", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Account.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content) })
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Account> createAccount(@Valid @RequestBody Account account){
        return ResponseEntity.of( Optional.of(accountDAO.save(account)));
    }



}
