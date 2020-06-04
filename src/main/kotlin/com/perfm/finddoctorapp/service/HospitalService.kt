package com.perfm.finddoctorapp.service

import com.perfm.finddoctorapp.model.HospitalDetails
import com.perfm.finddoctorapp.repository.HospitalDetailsRepository
import com.perfm.finddoctorapp.util.BasicCrud
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.*

class HospitalService(val hospitalDetailsRepository: HospitalDetailsRepository):BasicCrud<String,HospitalDetails> {
    override fun getAll(pageable: Pageable): Page<HospitalDetails> {
        return hospitalDetailsRepository.findAll(pageable)
    }

    override fun getById(id: String): Optional<HospitalDetails> {
        return hospitalDetailsRepository.findById(id)
    }

    override fun insert(obj: HospitalDetails): HospitalDetails {
       return hospitalDetailsRepository.insert(obj)
    }

    override fun update(obj: HospitalDetails): HospitalDetails {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: String): Optional<HospitalDetails> {
        TODO("Not yet implemented")
    }
}