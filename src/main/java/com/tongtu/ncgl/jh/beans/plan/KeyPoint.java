package com.tongtu.ncgl.jh.beans.plan;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyPoint<T> {

    private List<T> KeyPoints;

}
