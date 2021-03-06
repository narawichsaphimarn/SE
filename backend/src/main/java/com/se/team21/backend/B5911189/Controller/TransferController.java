package com.se.team21.backend.B5911189.Controller;
import com.se.team21.backend.B5911189.Repository.*;
import com.se.team21.backend.B5911189.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins =  "http://localhost:4200")
public class TransferController{
    @Autowired private TransferRepository transferRepository;

    @Autowired TransferController(TransferRepository transferRepository){
        this.transferRepository = transferRepository;
    }
    @GetMapping("/Transfer")
    public Collection<Transfer> getNameTransfer(){
        return transferRepository.findAll().stream().collect(Collectors.toList());
    }


}