package org.ielse.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LY on 2016/9/7.
 */
public class DataImportUtils {

    public static List<DataInfo> init() {
        DataInfo r1 = new DataInfo();
        r1.cover = "http://img0.imgtn.bdimg.com/it/u=2489291458,3252859626&fm=11&gp=0.jpg";
        r1.logo = "http://img2.duitang.com/uploads/item/201301/20/20130120194741_3if2E.thumb.600_0.png";
        r1.title = "10 Free 4 X 6 Prints";
        r1.subTitle = "Online Code";

        DataInfo r2 = new DataInfo();
        r2.cover = "http://tupian.enterdesk.com/2016/hxj/08/16/1602/ChMkJlexsJmIIe8dAAghrgQhdMQAAUdNAJInfYACCHG699.jpg";
        r2.logo = "http://pic22.nipic.com/20120708/8972260_202111240352_2.jpg";
        r2.title = "$20 Off $85+";
        r2.subTitle = "In-Store & Online";

        DataInfo r3 = new DataInfo();
        r3.cover = "http://img2.imgtn.bdimg.com/it/u=1800131217,1063103501&fm=11&gp=0.jpg";
        r3.logo = "http://img2.duitang.com/uploads/item/201301/20/20130120194741_3if2E.thumb.600_0.png";
        r3.title = "$30 Off $90";
        r3.subTitle = "Online Code";

        DataInfo r4 = new DataInfo();
        r4.cover = "http://img4.imgtn.bdimg.com/it/u=1680976998,1509734632&fm=11&gp=0.jpg";
        r4.logo = "http://img2.duitang.com/uploads/item/201301/20/20130120194741_3if2E.thumb.600_0.png";
        r4.title = "Free Lip Gloss on $15+";
        r4.subTitle = "Online Code";

        DataInfo r5 = new DataInfo();
        r5.cover = "http://desk.fd.zol-img.com.cn/t_s960x600c5/g5/M00/00/0A/ChMkJlecZcyIH-BIAAQVSYqHlFsAAT_2gMTwTMABBVh401.jpg";
        r5.logo = "http://pic22.nipic.com/20120708/8972260_202111240352_2.jpg";
        r5.title = "30% Off Select Prices";
        r5.subTitle = "Online Sale";

        DataInfo r6 = new DataInfo();
        r6.cover = "http://desk.fd.zol-img.com.cn/t_s960x600c5/g5/M00/02/06/ChMkJlbKyqeIWBwBADlexJVOKHMAALIewOsURQAOV7c671.jpg";
        r6.logo = "http://img2.duitang.com/uploads/item/201301/20/20130120194741_3if2E.thumb.600_0.png";
        r6.title = "Up to 70% Off";
        r6.subTitle = "Labor Day Online Sale";

        DataInfo r7 = new DataInfo();
        r7.cover = "http://image99.360doc.com/DownloadImg/2016/08/2210/78467867_1.jpg";
        r7.logo = "http://img2.duitang.com/uploads/item/201301/20/20130120194741_3if2E.thumb.600_0.png";
        r7.title = "Play to Win Up to $50";
        r7.subTitle = "You could even win $5k!";

        DataInfo r8 = new DataInfo();
        r8.cover = "http://img.51ztzj.com/upload/image/20160727/201607266_670x419.jpg";
        r8.logo = "http://pic22.nipic.com/20120708/8972260_202111240352_2.jpg";
        r8.title = "Fares from $39 One Way";
        r8.subTitle = "Hot 2 Day Sale";

        return Arrays.asList(new DataInfo[]{r1, r2, r3, r4, r5, r6, r7, r8 });
    }
}
