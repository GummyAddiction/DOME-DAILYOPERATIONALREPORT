package com.dome.reporttxn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dome.reporttxn.model.ReportTxn;
import com.dome.reporttxn.service.ReprotTxnService;

@RestController
@RequestMapping("/reporttxn")
// @CrossOrigin(origins = {"http://10.64.10.24:4200"})
public class ReportTxnController {

    @Autowired
    private final ReprotTxnService reprotTxnService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    public ReportTxnController(ReprotTxnService reprotTxnService) {
        this.reprotTxnService = reprotTxnService;
    }

    @GetMapping("/reports")
    public ResponseEntity<List<ReportTxn>> getAllReportTxn(
            @RequestParam(required = true) String dateCreatedStart,
            @RequestParam(required = true) String dateCreatedEnd,
            @RequestParam(required = true) List<Integer> functionalLocationId) {
        // API GET dengan param startdate, enddate,functonallocationid, page, dan size

        // Pageable pagging = PageRequest.of(page, size,
        // Sort.by("Datecreated").descending());
        // Menambahkan pagging dengan start page 0 dan banyaknya data setiap halaman
        // dengan var size

        List<ReportTxn> reporttxn = reprotTxnService.findAllReportTxn(dateCreatedStart, dateCreatedEnd,
                functionalLocationId);
        System.out.println("Success masuk GET API report txn");
        System.out.println(httpServletRequest.getRequestURL());
        return new ResponseEntity<>(reporttxn, HttpStatus.OK);

    }

    @DeleteMapping("/reports/delete/{id}")
    public ResponseEntity<Object> deleteReportTxn(@PathVariable Long id){
        reprotTxnService.deleteReportTxn(id);
        System.out.println("Success masuk Delete API report txn");
        System.out.println(httpServletRequest.getRequestURL());
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
