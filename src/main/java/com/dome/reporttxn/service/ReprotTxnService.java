package com.dome.reporttxn.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dome.reporttxn.model.FunctionalLocation;
import com.dome.reporttxn.model.ReportTxn;
import com.dome.reporttxn.repository.ReportTxnRepo;


@Service
public class ReprotTxnService {

    @Autowired
    private ReportTxnRepo reportTxnRepo;
 
    public ReprotTxnService(ReportTxnRepo reportTxnRepo ) {
        this.reportTxnRepo = reportTxnRepo;
    }

    public List<ReportTxn> findAllReportTxn(String dateCreatedStart, String dateCreatedEnd,List<Integer> functionalLocationId){
        return reportTxnRepo.findAllReportTxn(dateCreatedStart, dateCreatedEnd,functionalLocationId );
    }

    public void deleteReportTxn(Long id){
        reportTxnRepo.deleteById(id);
    }

   
   
}
