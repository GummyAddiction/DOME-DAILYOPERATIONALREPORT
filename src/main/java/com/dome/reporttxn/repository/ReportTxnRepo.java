package com.dome.reporttxn.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dome.reporttxn.model.ReportTxn;


@Repository
public interface ReportTxnRepo extends JpaRepository<ReportTxn, Long> {

    //@Query(value = "SELECT RTXN.Reporttransactionid, RTXN.Shift,  RTXN.Datecreated,  JT.NAME AS Jobtype,  RTXN.Timeinformed,  RTXN.Starttime, RTXN.Finishtime,  RTXN.Totaltime, FL.Name as Functionallocation,  SFL.NAME as Subfunctionallocation ,  M.NAME as Machine, DM.NAME as Detailmachine ,  RTXN.Problem,  RTXN.Cause,  B.Name,  RTXN.Action,  RTXN.Executor1,  RTXN.Executor2,  RTXN.Executorextra,  RTXN.Condition,  RTXN.Reason,  RTXN.Note FROM ReportTxn RTXN  LEFT JOIN JOBTYPE JT ON JT.JOBTYPEID = RTXN.JOBTYPE  LEFT JOIN FUNCTIONALLOCATION FL ON FL.FUNCTIONALLOCATIONID = RTXN.FUNCTIONALLOCATION  LEFT JOIN SUBFUNCTIONALLOCATION SFL ON SFL.SUBFUNCTIONALLOCATIONID = RTXN.SUBFUNCTIONALLOCATION  LEFT JOIN MACHINE M ON M.MACHINEID = RTXN.MACHINE  LEFT JOIN DETAILMACHINE DM ON DM.DETAILMACHINEID = RTXN.DETAILMACHINE  LEFT JOIN BIAS B ON B.BIASID = RTXN.BIAS", nativeQuery = true)
    @Query( value = "SELECT RTXN.Reporttransactionid, "
    +"RTXN.Shift, "  
    +"RTXN.Datecreated,  "
    +"RTXN.Createdby,  "
    +"RTXN.Updatedby,  "
    +"RTXN.Updatedate,  "
    +"JT.NAME AS Jobtype,  "
    +"RTXN.Timeinformed,  "
    +"RTXN.Starttime, "
    +"RTXN.Finishtime,  "
    +"RTXN.Totaltime, "
    +"RTXN.Stoppagetime,  "
    +"FL.Name as Functionallocation,  "
    +"SFL.NAME as Subfunctionallocation , " 
    +"M.NAME as Machine, " 
    +"DM.NAME as Detailmachine ,  "
    +"RTXN.Problem,  "
    +"RTXN.Cause,  "
    +"B.Name as Bias,  "
    +"RTXN.Action, "  
    +"RTXN.Executor1, "  
    +"RTXN.Executor2, " 
    +"RTXN.Executorextra, " 
    +"RTXN.Condition,  "
    +"RTXN.Reason,  "
    +"RTXN.Note "
    +"FROM ReportTxn RTXN  LEFT JOIN JOBTYPE JT ON JT.JOBTYPEID = RTXN.JOBTYPE  LEFT JOIN FUNCTIONALLOCATION FL ON FL.FUNCTIONALLOCATIONID = RTXN.FUNCTIONALLOCATION  LEFT JOIN SUBFUNCTIONALLOCATION SFL ON SFL.SUBFUNCTIONALLOCATIONID = RTXN.SUBFUNCTIONALLOCATION  LEFT JOIN MACHINE M ON M.MACHINEID = RTXN.MACHINE  LEFT JOIN DETAILMACHINE DM ON DM.DETAILMACHINEID = RTXN.DETAILMACHINE  LEFT JOIN BIAS B ON B.BIASID = RTXN.BIAS"
    +" WHERE (RTXN.Datecreated BETWEEN :dateCreatedStart AND :dateCreatedEnd AND RTXN.FUNCTIONALLOCATION in( :functionalLocationId)) ORDER BY RTXN.Reporttransactionid" , nativeQuery = true)

    List<ReportTxn> findAllReportTxn(@Param("dateCreatedStart") String dateCreatedStart,@Param("dateCreatedEnd") String dateCreatedEnd, @Param("functionalLocationId") List<Integer> functionalLocationId);
    

 }
