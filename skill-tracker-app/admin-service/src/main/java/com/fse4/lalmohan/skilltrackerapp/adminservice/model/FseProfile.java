package com.fse4.lalmohan.skilltrackerapp.adminservice.model;


import com.fse4.lalmohan.skilltrackerapp.adminservice.entity.Engineer;
import com.fse4.lalmohan.skilltrackerapp.adminservice.entity.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FseProfile {

    private Engineer engineer;
    private List<Skill> skillSet;

}
