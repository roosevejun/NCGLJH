package com.tongtu.ncgl.jh.beans.plan;

import com.tongtu.ncgl.jh.beans.orm.ItemAqsmfhgm;
import com.tongtu.ncgl.jh.beans.orm.ItemNdjh;
import com.tongtu.ncgl.jh.beans.orm.ItemQljsgm;
import com.tongtu.ncgl.jh.beans.orm.ItemXmjbxx;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plandetail {

    private ItemXmjbxx xmjbxx;

    private List<ItemNdjh> ndjh;

    private JSGMXX jsgmxx;

    private KeyPoint keyPoint;


}
