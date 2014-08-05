package com.justwe.util;

public class XMLMatcher {
	private int currentIndex;
	private String xml;
	private String tag;

	public XMLMatcher(String xml, String tag) {
		this.xml = xml;
		this.tag = tag;
	}

	public boolean find() {
		if (xml.substring(currentIndex).contains("<" + tag)) {
			currentIndex = xml.indexOf("<" + tag, currentIndex + 1);
			return true;
		}
		return false;
	}

	public String group() {
		String closeTag = "</" + tag + ">";
		int end = xml.indexOf(closeTag, currentIndex);
		end += closeTag.length();
		String result = xml.substring(currentIndex, end);
		currentIndex = end;
		return result;
	}

	public static void main(String[] args) {
		String test = "<MEBS_MOBILE><REP name=\"commodity_data_query\"><RESULT><RETCODE>0</RETCODE><MESSAGE></MESSAGE></RESULT><RESULTLIST><REC><CO_I>99BTH</CO_I><CO_N>���Ѻ�����</CO_N><L_SET>2113-08-01</L_SET><PR_C>39.76</PR_C><BID>39.4</BID><BI_D>4</BI_D><OFFER>41.6</OFFER><OF_D>1</OF_D><HIGH>39.4</HIGH><LOW>39</LOW><LAST>39.4</LAST><AVG>39.06</AVG><CHA>-0.36</CHA><VO_T>12</VO_T><TT_O>2896</TT_O><CR_T>20140804110924</CR_T></REC><REC><CO_I>99BTI</CO_I><CO_N>�����Ѳ�</CO_N><L_SET>2113-08-01</L_SET><PR_C>79.05</PR_C><BID>78.05</BID><BI_D>43</BI_D><OFFER>84</OFFER><OF_D>11</OF_D><HIGH>79</HIGH><LOW>79</LOW><LAST>79</LAST><AVG>79</AVG><CHA>-0.05</CHA><VO_T>2</VO_T><TT_O>814</TT_O><CR_T>20140804141521</CR_T></REC><REC><CO_I>99BRBSY</CO_I><CO_N>���Ƹ�����</CO_N><L_SET>2114-01-12</L_SET><PR_C>2610</PR_C><BID>2571</BID><BI_D>1</BI_D><OFFER>2611</OFFER><OF_D>1</OF_D><HIGH>2621</HIGH><LOW>2606</LOW><LAST>2610</LAST><AVG>2615</AVG><CHA>0</CHA><VO_T>1786</VO_T><TT_O>5108</TT_O><CR_T>20140804154400</CR_T></REC><REC><CO_I>99CM0011</CO_I><CO_N>�����Ĳ�����</CO_N><L_SET>2114-07-24</L_SET><PR_C>233.95</PR_C><BID>236.1</BID><BI_D>2</BI_D><OFFER>236.2</OFFER><OF_D>2</OF_D><HIGH>237.9</HIGH><LOW>232.05</LOW><LAST>236.1</LAST><AVG>234.8</AVG><CHA>2.15</CHA><VO_T>3210</VO_T><TT_O>6642</TT_O><CR_T>20140804155926</CR_T></REC><REC><CO_I>99B30021</CO_I><CO_N>���������人</CO_N><L_SET>2114-06-21</L_SET><PR_C>2861</PR_C><BID>2858</BID><BI_D>9</BI_D><OFFER>2890</OFFER><OF_D>5</OF_D><HIGH>2861</HIGH><LOW>2858</LOW><LAST>2861</LAST><AVG>2860</AVG><CHA>0</CHA><VO_T>3002</VO_T><TT_O>1694</TT_O><CR_T>20140804155239</CR_T></REC><REC><CO_I>99BPEMM</CO_I><CO_N>����ϩï��</CO_N><L_SET>2114-03-08</L_SET><PR_C>11350</PR_C><BID>10521</BID><BI_D>1</BI_D><OFFER>11772</OFFER><OF_D>1</OF_D><HIGH>11500</HIGH><LOW>10783</LOW><LAST>10783</LAST><AVG>11022</AVG><CHA>-567</CHA><VO_T>6</VO_T><TT_O>30</TT_O><CR_T>20140804154708</CR_T></REC><REC><CO_I>99BPBLZ</CO_I><CO_N>�߲�����</CO_N><L_SET>2112-12-20</L_SET><PR_C>3560</PR_C><BID>3368</BID><BI_D>1</BI_D><OFFER>3515</OFFER><OF_D>1</OF_D><HIGH>3755</HIGH><LOW>3346</LOW><LAST>3399</LAST><AVG>3744</AVG><CHA>-161</CHA><VO_T>332</VO_T><TT_O>324</TT_O><CR_T>20140804155746</CR_T></REC><REC><CO_I>99BBF</CO_I><CO_N>��ľ��</CO_N><L_SET>2114-07-01</L_SET><PR_C>62.5</PR_C><BID>62.4</BID><BI_D>1579</BI_D><OFFER>62.45</OFFER><OF_D>4</OF_D><HIGH>63.4</HIGH><LOW>62</LOW><LAST>62.4</LAST><AVG>62.5</AVG><CHA>-0.1</CHA><VO_T>265214</VO_T><TT_O>633748</TT_O><CR_T>20140804155924</CR_T></REC><REC><CO_I>99BRBCW</CO_I><CO_N>���Ƹִ���</CO_N><L_SET>2112-08-28</L_SET><PR_C>3333</PR_C><BID>0</BID><BI_D>0</BI_D><OFFER>0</OFFER><OF_D>0</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>3333</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>556</TT_O><CR_T>20140804090000</CR_T></REC><REC><CO_I>99BRBSD</CO_I><CO_N>���Ƹ�ɽ��</CO_N><L_SET>2112-09-26</L_SET><PR_C>2681</PR_C><BID>2494</BID><BI_D>1</BI_D><OFFER>0</OFFER><OF_D>0</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>2681</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>4108</TT_O><CR_T>20140804090539</CR_T></REC><REC><CO_I>99BMPHD</CO_I><CO_N>�к�庪��</CO_N><L_SET>2114-05-18</L_SET><PR_C>2589</PR_C><BID>2550</BID><BI_D>1</BI_D><OFFER>2796</OFFER><OF_D>1</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>2589</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>24</TT_O><CR_T>20140804141252</CR_T></REC><REC><CO_I>99BRBCQ</CO_I><CO_N>���Ƹ�����</CO_N><L_SET>2113-09-01</L_SET><PR_C>3423</PR_C><BID>3160</BID><BI_D>1</BI_D><OFFER>3496</OFFER><OF_D>1</OF_D><HIGH>3492</HIGH><LOW>3461</LOW><LAST>3461</LAST><AVG>3481</AVG><CHA>38</CHA><VO_T>6</VO_T><TT_O>15032</TT_O><CR_T>20140804135042</CR_T></REC><REC><CO_I>99B40016</CO_I><CO_N>ϡ������</CO_N><L_SET>2114-07-25</L_SET><PR_C>270.4</PR_C><BID>270.4</BID><BI_D>12</BI_D><OFFER>270.6</OFFER><OF_D>129</OF_D><HIGH>272.2</HIGH><LOW>268</LOW><LAST>270.6</LAST><AVG>271.4</AVG><CHA>0.2</CHA><VO_T>969520</VO_T><TT_O>1800934</TT_O><CR_T>20140804155951</CR_T></REC><REC><CO_I>99B40010</CO_I><CO_N>����</CO_N><L_SET>2113-12-21</L_SET><PR_C>120.5</PR_C><BID>120.6</BID><BI_D>36</BI_D><OFFER>120.7</OFFER><OF_D>80</OF_D><HIGH>120.9</HIGH><LOW>120.2</LOW><LAST>120.7</LAST><AVG>120.7</AVG><CHA>0.2</CHA><VO_T>25560</VO_T><TT_O>13348</TT_O><CR_T>20140804155951</CR_T></REC><REC><CO_I>99BSC</CO_I><CO_N>����ú</CO_N><L_SET>2112-09-05</L_SET><PR_C>499</PR_C><BID>503</BID><BI_D>13</BI_D><OFFER>506</OFFER><OF_D>10</OF_D><HIGH>506</HIGH><LOW>496</LOW><LAST>505</LAST><AVG>501</AVG><CHA>6</CHA><VO_T>1444</VO_T><TT_O>175854</TT_O><CR_T>20140804154739</CR_T></REC><REC><CO_I>99BRBCF</CO_I><CO_N>���Ƹֳ��</CO_N><L_SET>2113-04-13</L_SET><PR_C>2722</PR_C><BID>2729</BID><BI_D>5</BI_D><OFFER>2734</OFFER><OF_D>1</OF_D><HIGH>2733</HIGH><LOW>2716</LOW><LAST>2730</LAST><AVG>2725</AVG><CHA>8</CHA><VO_T>6054</VO_T><TT_O>3116</TT_O><CR_T>20140804155935</CR_T></REC><REC><CO_I>99BWSS</CO_I><CO_N>�����</CO_N><L_SET>2114-06-01</L_SET><PR_C>4.9</PR_C><BID>4.72</BID><BI_D>5</BI_D><OFFER>5</OFFER><OF_D>100</OF_D><HIGH>4.71</HIGH><LOW>4.71</LOW><LAST>4.71</LAST><AVG>4.71</AVG><CHA>-0.19</CHA><VO_T>2</VO_T><TT_O>4790</TT_O><CR_T>20140804151535</CR_T></REC><REC><CO_I>99C20005</CO_I><CO_N>����</CO_N><L_SET>2114-04-29</L_SET><PR_C>62.45</PR_C><BID>62.9</BID><BI_D>433</BI_D><OFFER>62.95</OFFER><OF_D>363</OF_D><HIGH>63.45</HIGH><LOW>62.2</LOW><LAST>62.9</LAST><AVG>63</AVG><CHA>0.45</CHA><VO_T>662450</VO_T><TT_O>633754</TT_O><CR_T>20140804155950</CR_T></REC><REC><CO_I>99BRBTY</CO_I><CO_N>���Ƹ�̫ԭ</CO_N><L_SET>2112-02-11</L_SET><PR_C>3040</PR_C><BID>3040</BID><BI_D>5</BI_D><OFFER>3041</OFFER><OF_D>1</OF_D><HIGH>3048</HIGH><LOW>3020</LOW><LAST>3039</LAST><AVG>3041</AVG><CHA>-1</CHA><VO_T>2804</VO_T><TT_O>4074</TT_O><CR_T>20140804155814</CR_T></REC><REC><CO_I>99B40017</CO_I><CO_N>����</CO_N><L_SET>2114-07-08</L_SET><PR_C>1363</PR_C><BID>1363</BID><BI_D>471</BI_D><OFFER>1364</OFFER><OF_D>204</OF_D><HIGH>1370</HIGH><LOW>1351</LOW><LAST>1364</LAST><AVG>1362</AVG><CHA>1</CHA><VO_T>429474</VO_T><TT_O>26066</TT_O><CR_T>20140804155958</CR_T></REC><REC><CO_I>99C20004</CO_I><CO_N>�½������</CO_N><L_SET>2114-04-08</L_SET><PR_C>58.4</PR_C><BID>57.7</BID><BI_D>9464</BI_D><OFFER>57.9</OFFER><OF_D>4529</OF_D><HIGH>59.2</HIGH><LOW>57</LOW><LAST>57.7</LAST><AVG>58.1</AVG><CHA>-0.7</CHA><VO_T>1016626</VO_T><TT_O>3335066</TT_O><CR_T>20140804155956</CR_T></REC><REC><CO_I>99BPET</CO_I><CO_N>������Ƭ</CO_N><L_SET>2111-05-11</L_SET><PR_C>10204</PR_C><BID>0</BID><BI_D>0</BI_D><OFFER>0</OFFER><OF_D>0</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>10204</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>386</TT_O><CR_T>20140804090000</CR_T></REC><REC><CO_I>99BOLL</CO_I><CO_N>ԭ������</CO_N><L_SET>2114-02-08</L_SET><PR_C>33.82</PR_C><BID>33.88</BID><BI_D>22673</BI_D><OFFER>33.89</OFFER><OF_D>139</OF_D><HIGH>33.99</HIGH><LOW>33.76</LOW><LAST>33.88</LAST><AVG>33.89</AVG><CHA>0.06</CHA><VO_T>817080</VO_T><TT_O>4914958</TT_O><CR_T>20140804155959</CR_T></REC><REC><CO_I>99BCC</CO_I><CO_N>��ú</CO_N><L_SET>2114-03-27</L_SET><PR_C>589</PR_C><BID>594</BID><BI_D>26</BI_D><OFFER>595</OFFER><OF_D>34</OF_D><HIGH>595</HIGH><LOW>589</LOW><LAST>595</LAST><AVG>592</AVG><CHA>6</CHA><VO_T>1052</VO_T><TT_O>59324</TT_O><CR_T>20140804155419</CR_T></REC><REC><CO_I>99BRCYK</CO_I><CO_N>�Ⱦ���Ӫ��</CO_N><L_SET>2114-07-01</L_SET><PR_C>2850</PR_C><BID>2846</BID><BI_D>151</BI_D><OFFER>3000</OFFER><OF_D>1</OF_D><HIGH>2852</HIGH><LOW>2843</LOW><LAST>2847</LAST><AVG>2848</AVG><CHA>-3</CHA><VO_T>34262</VO_T><TT_O>1822</TT_O><CR_T>20140804154916</CR_T></REC><REC><CO_I>99BCEC</CO_I><CO_N>�޻�����</CO_N><L_SET>2114-02-23</L_SET><PR_C>15600</PR_C><BID>14350</BID><BI_D>1</BI_D><OFFER>15800</OFFER><OF_D>1</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>15600</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>226</TT_O><CR_T>20140804100707</CR_T></REC><REC><CO_I>99C10005</CO_I><CO_N>֥����������</CO_N><L_SET>2114-07-26</L_SET><PR_C>0</PR_C><BID>0</BID><BI_D>0</BI_D><OFFER>0</OFFER><OF_D>0</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>0</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>0</TT_O><CR_T>20140804090000</CR_T></REC><REC><CO_I>99BMEG</CO_I><CO_N>�Ҷ���</CO_N><L_SET>2114-06-27</L_SET><PR_C>6324</PR_C><BID>6290</BID><BI_D>6</BI_D><OFFER>6500</OFFER><OF_D>1</OF_D><HIGH>6350</HIGH><LOW>6312</LOW><LAST>6318</LAST><AVG>6324</AVG><CHA>-6</CHA><VO_T>66700</VO_T><TT_O>16</TT_O><CR_T>20140804140707</CR_T></REC><REC><CO_I>99C10006</CO_I><CO_N>��˿</CO_N><L_SET>2114-07-18</L_SET><PR_C>23.8</PR_C><BID>24.42</BID><BI_D>2</BI_D><OFFER>24.88</OFFER><OF_D>5</OF_D><HIGH>25.7</HIGH><LOW>23.56</LOW><LAST>24.88</LAST><AVG>25.1</AVG><CHA>1.08</CHA><VO_T>1254</VO_T><TT_O>2140</TT_O><CR_T>20140804155908</CR_T></REC><REC><CO_I>99BPVCSD</CO_I><CO_N>PVCɽ��</CO_N><L_SET>2113-03-30</L_SET><PR_C>5880</PR_C><BID>5862</BID><BI_D>42</BI_D><OFFER>5864</OFFER><OF_D>41</OF_D><HIGH>5900</HIGH><LOW>5856</LOW><LAST>5862</LAST><AVG>5860</AVG><CHA>-18</CHA><VO_T>50746</VO_T><TT_O>12626</TT_O><CR_T>20140804155945</CR_T></REC><REC><CO_I>99BGR</CO_I><CO_N>֬����</CO_N><L_SET>2114-01-08</L_SET><PR_C>13700</PR_C><BID>13695</BID><BI_D>6</BI_D><OFFER>13700</OFFER><OF_D>7</OF_D><HIGH>13730</HIGH><LOW>13680</LOW><LAST>13700</LAST><AVG>13700</AVG><CHA>0</CHA><VO_T>20568</VO_T><TT_O>37050</TT_O><CR_T>20140804155947</CR_T></REC><REC><CO_I>99BLC</CO_I><CO_N>̼���</CO_N><L_SET>2113-01-22</L_SET><PR_C>39.23</PR_C><BID>39</BID><BI_D>1</BI_D><OFFER>39.56</OFFER><OF_D>18</OF_D><HIGH>39.34</HIGH><LOW>38.99</LOW><LAST>39.05</LAST><AVG>39.24</AVG><CHA>-0.18</CHA><VO_T>28368</VO_T><TT_O>1998</TT_O><CR_T>20140804155804</CR_T></REC><REC><CO_I>99BCK</CO_I><CO_N>��̿</CO_N><L_SET>2113-04-10</L_SET><PR_C>1004</PR_C><BID>1026</BID><BI_D>25</BI_D><OFFER>1028</OFFER><OF_D>121</OF_D><HIGH>1042</HIGH><LOW>1004</LOW><LAST>1026</LAST><AVG>1022</AVG><CHA>22</CHA><VO_T>45940</VO_T><TT_O>442112</TT_O><CR_T>20140804155938</CR_T></REC><REC><CO_I>99BCYDE</CO_I><CO_N>����ɴ�ߵ°���</CO_N><L_SET>2114-03-07</L_SET><PR_C>953</PR_C><BID>952</BID><BI_D>488</BI_D><OFFER>953</OFFER><OF_D>340</OF_D><HIGH>961</HIGH><LOW>951</LOW><LAST>953</LAST><AVG>957</AVG><CHA>0</CHA><VO_T>276824</VO_T><TT_O>120612</TT_O><CR_T>20140804155944</CR_T></REC><REC><CO_I>99BCO</CO_I><CO_N>ԭ��</CO_N><L_SET>2110-12-09</L_SET><PR_C>5430</PR_C><BID>5412</BID><BI_D>4</BI_D><OFFER>5490</OFFER><OF_D>2</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>5430</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>4058</TT_O><CR_T>20140804141610</CR_T></REC><REC><CO_I>99BPB</CO_I><CO_N>Ǧ��</CO_N><L_SET>2113-09-13</L_SET><PR_C>11000</PR_C><BID>11000</BID><BI_D>2</BI_D><OFFER>0</OFFER><OF_D>0</OF_D><HIGH>11825</HIGH><LOW>11715</LOW><LAST>11815</LAST><AVG>11785</AVG><CHA>815</CHA><VO_T>18334</VO_T><TT_O>298</TT_O><CR_T>20140804142351</CR_T></REC><REC><CO_I>99BCAHY</CO_I><CO_N>ɽ���޺�ҵ</CO_N><L_SET>2114-02-23</L_SET><PR_C>1067</PR_C><BID>1058</BID><BI_D>26</BI_D><OFFER>1059</OFFER><OF_D>116</OF_D><HIGH>1064</HIGH><LOW>1052</LOW><LAST>1059</LAST><AVG>1061</AVG><CHA>-8</CHA><VO_T>68284</VO_T><TT_O>742890</TT_O><CR_T>20140804155953</CR_T></REC><REC><CO_I>99BFGSH</CO_I><CO_N>ƽ�岣��ɳ��</CO_N><L_SET>2113-11-09</L_SET><PR_C>787</PR_C><BID>796</BID><BI_D>2</BI_D><OFFER>797</OFFER><OF_D>105</OF_D><HIGH>804</HIGH><LOW>782</LOW><LAST>796</LAST><AVG>796</AVG><CHA>9</CHA><VO_T>36492</VO_T><TT_O>57408</TT_O><CR_T>20140804155725</CR_T></REC><REC><CO_I>99BRURV</CO_I><CO_N>�콺�𽺹�</CO_N><L_SET>2114-06-08</L_SET><PR_C>10290</PR_C><BID>10345</BID><BI_D>16</BI_D><OFFER>10350</OFFER><OF_D>9</OF_D><HIGH>10380</HIGH><LOW>10250</LOW><LAST>10350</LAST><AVG>10340</AVG><CHA>60</CHA><VO_T>36268</VO_T><TT_O>44172</TT_O><CR_T>20140804155959</CR_T></REC><REC><CO_I>99BCKWT</CO_I><CO_N>��̿ΰ��</CO_N><L_SET>2114-07-01</L_SET><PR_C>908</PR_C><BID>927</BID><BI_D>14</BI_D><OFFER>928</OFFER><OF_D>611</OF_D><HIGH>940</HIGH><LOW>908</LOW><LAST>928</LAST><AVG>920</AVG><CHA>20</CHA><VO_T>370308</VO_T><TT_O>196504</TT_O><CR_T>20140804155350</CR_T></REC><REC><CO_I>99BPTA</CO_I><CO_N>PTA</CO_N><L_SET>2112-06-06</L_SET><PR_C>7452</PR_C><BID>7500</BID><BI_D>1</BI_D><OFFER>7550</OFFER><OF_D>12</OF_D><HIGH>7500</HIGH><LOW>7500</LOW><LAST>7500</LAST><AVG>7500</AVG><CHA>48</CHA><VO_T>2</VO_T><TT_O>4314</TT_O><CR_T>20140804140103</CR_T></REC><REC><CO_I>99BWGS</CO_I><CO_N>��ɰ��</CO_N><L_SET>2114-06-01</L_SET><PR_C>4.64</PR_C><BID>4.64</BID><BI_D>10</BI_D><OFFER>4.65</OFFER><OF_D>1</OF_D><HIGH>4.64</HIGH><LOW>4.55</LOW><LAST>4.64</LAST><AVG>4.59</AVG><CHA>0</CHA><VO_T>124</VO_T><TT_O>47706</TT_O><CR_T>20140804151329</CR_T></REC><REC><CO_I>99B40009</CO_I><CO_N>ϡ��������</CO_N><L_SET>2114-02-23</L_SET><PR_C>1272</PR_C><BID>1262</BID><BI_D>6</BI_D><OFFER>1270</OFFER><OF_D>3</OF_D><HIGH>1272</HIGH><LOW>1250</LOW><LAST>1266</LAST><AVG>1262</AVG><CHA>-6</CHA><VO_T>51724</VO_T><TT_O>20592</TT_O><CR_T>20140804155828</CR_T></REC><REC><CO_I>99BPBXA</CO_I><CO_N>�߲�����</CO_N><L_SET>2112-12-20</L_SET><PR_C>2650</PR_C><BID>2503</BID><BI_D>2</BI_D><OFFER>2649</OFFER><OF_D>216</OF_D><HIGH>2652</HIGH><LOW>2650</LOW><LAST>2650</LAST><AVG>2651</AVG><CHA>0</CHA><VO_T>5108</VO_T><TT_O>546</TT_O><CR_T>20140804133301</CR_T></REC><REC><CO_I>99B20010</CO_I><CO_N>���ͻ����Ͷ���</CO_N><L_SET>2114-03-11</L_SET><PR_C>7.67</PR_C><BID>7.67</BID><BI_D>120</BI_D><OFFER>7.68</OFFER><OF_D>1253</OF_D><HIGH>7.78</HIGH><LOW>7.67</LOW><LAST>7.68</LAST><AVG>7.72</AVG><CHA>0.01</CHA><VO_T>769294</VO_T><TT_O>1658086</TT_O><CR_T>20140804155918</CR_T></REC><REC><CO_I>99BAPYT</CO_I><CO_N>ƻ��</CO_N><L_SET>2114-05-20</L_SET><PR_C>9.23</PR_C><BID>9.2</BID><BI_D>158</BI_D><OFFER>9.21</OFFER><OF_D>1293</OF_D><HIGH>9.25</HIGH><LOW>9.11</LOW><LAST>9.21</LAST><AVG>9.17</AVG><CHA>-0.02</CHA><VO_T>569520</VO_T><TT_O>3426590</TT_O><CR_T>20140804155942</CR_T></REC><REC><CO_I>99B20011</CO_I><CO_N>PVC����</CO_N><L_SET>2114-07-31</L_SET><PR_C>5204</PR_C><BID>5196</BID><BI_D>12</BI_D><OFFER>5208</OFFER><OF_D>9</OF_D><HIGH>5220</HIGH><LOW>5196</LOW><LAST>5208</LAST><AVG>5202</AVG><CHA>4</CHA><VO_T>10406</VO_T><TT_O>5742</TT_O><CR_T>20140804155957</CR_T></REC><REC><CO_I>99BCUSH</CO_I><CO_N>����ͭ�Ϻ�</CO_N><L_SET>2112-09-26</L_SET><PR_C>42900</PR_C><BID>42820</BID><BI_D>1</BI_D><OFFER>43300</OFFER><OF_D>1</OF_D><HIGH>43290</HIGH><LOW>42850</LOW><LAST>42990</LAST><AVG>43040</AVG><CHA>90</CHA><VO_T>2554</VO_T><TT_O>958</TT_O><CR_T>20140804154548</CR_T></REC><REC><CO_I>99B20012</CO_I><CO_N>ABS��֬����</CO_N><L_SET>2113-12-31</L_SET><PR_C>12.36</PR_C><BID>12.32</BID><BI_D>1783</BI_D><OFFER>12.33</OFFER><OF_D>181</OF_D><HIGH>12.4</HIGH><LOW>12.27</LOW><LAST>12.33</LAST><AVG>12.32</AVG><CHA>-0.03</CHA><VO_T>6542</VO_T><TT_O>5380</TT_O><CR_T>20140804155829</CR_T></REC><REC><CO_I>99BXCDZ</CO_I><CO_N>�߲Ķ���</CO_N><L_SET>2113-08-03</L_SET><PR_C>2785</PR_C><BID>2789</BID><BI_D>3</BI_D><OFFER>2791</OFFER><OF_D>71</OF_D><HIGH>2793</HIGH><LOW>2782</LOW><LAST>2790</LAST><AVG>2789</AVG><CHA>5</CHA><VO_T>3080</VO_T><TT_O>3130</TT_O><CR_T>20140804155541</CR_T></REC><REC><CO_I>99BROH</CO_I><CO_N>�����ͺ�����</CO_N><L_SET>2114-07-01</L_SET><PR_C>11.78</PR_C><BID>11.68</BID><BI_D>1</BI_D><OFFER>11.71</OFFER><OF_D>200</OF_D><HIGH>11.77</HIGH><LOW>11.65</LOW><LAST>11.71</LAST><AVG>11.73</AVG><CHA>-0.07</CHA><VO_T>13652</VO_T><TT_O>169050</TT_O><CR_T>20140804155533</CR_T></REC><REC><CO_I>99BRBYKG</CO_I><CO_N>���Ƹ�����</CO_N><L_SET>2114-07-01</L_SET><PR_C>2994</PR_C><BID>2996</BID><BI_D>68</BI_D><OFFER>2998</OFFER><OF_D>124</OF_D><HIGH>2998</HIGH><LOW>2992</LOW><LAST>2998</LAST><AVG>2994</AVG><CHA>4</CHA><VO_T>21914</VO_T><TT_O>8708</TT_O><CR_T>20140804155718</CR_T></REC><REC><CO_I>99BMG</CO_I><CO_N>����þ��</CO_N><L_SET>2112-12-20</L_SET><PR_C>12770</PR_C><BID>12740</BID><BI_D>3</BI_D><OFFER>12775</OFFER><OF_D>4</OF_D><HIGH>12790</HIGH><LOW>12760</LOW><LAST>12775</LAST><AVG>12770</AVG><CHA>5</CHA><VO_T>1336</VO_T><TT_O>1344</TT_O><CR_T>20140804155551</CR_T></REC><REC><CO_I>99BPBCQ</CO_I><CO_N>�߲�����</CO_N><L_SET>2112-12-21</L_SET><PR_C>2710</PR_C><BID>2555</BID><BI_D>1</BI_D><OFFER>2703</OFFER><OF_D>5</OF_D><HIGH>2711</HIGH><LOW>2697</LOW><LAST>2701</LAST><AVG>2706</AVG><CHA>-9</CHA><VO_T>8544</VO_T><TT_O>192</TT_O><CR_T>20140804141232</CR_T></REC><REC><CO_I>99G10001</CO_I><CO_N>����ʯ</CO_N><L_SET>2114-07-04</L_SET><PR_C>576.75</PR_C><BID>578.5</BID><BI_D>6</BI_D><OFFER>579.5</OFFER><OF_D>2</OF_D><HIGH>580</HIGH><LOW>574</LOW><LAST>578.25</LAST><AVG>577.75</AVG><CHA>1.5</CHA><VO_T>16484</VO_T><TT_O>10382</TT_O><CR_T>20140804155611</CR_T></REC><REC><CO_I>99C50001</CO_I><CO_N>�������</CO_N><L_SET>2114-01-26</L_SET><PR_C>145.8</PR_C><BID>145.6</BID><BI_D>1414</BI_D><OFFER>145.7</OFFER><OF_D>1026</OF_D><HIGH>147.2</HIGH><LOW>144.9</LOW><LAST>145.7</LAST><AVG>146</AVG><CHA>-0.1</CHA><VO_T>459084</VO_T><TT_O>1715936</TT_O><CR_T>20140804155958</CR_T></REC><REC><CO_I>99CT0005</CO_I><CO_N>�����ڲ� </CO_N><L_SET>2114-07-23</L_SET><PR_C>71.4</PR_C><BID>69.7</BID><BI_D>2523</BI_D><OFFER>69.8</OFFER><OF_D>1353</OF_D><HIGH>71.8</HIGH><LOW>69.6</LOW><LAST>69.8</LAST><AVG>70.4</AVG><CHA>-1.6</CHA><VO_T>1498088</VO_T><TT_O>9403676</TT_O><CR_T>20140804155956</CR_T></REC><REC><CO_I>99C50002</CO_I><CO_N>���Ѿƾ���</CO_N><L_SET>2114-06-07</L_SET><PR_C>433.2</PR_C><BID>421.8</BID><BI_D>101</BI_D><OFFER>422</OFFER><OF_D>325</OF_D><HIGH>430</HIGH><LOW>421.2</LOW><LAST>422</LAST><AVG>424.8</AVG><CHA>-11.2</CHA><VO_T>347736</VO_T><TT_O>404762</TT_O><CR_T>20140804155952</CR_T></REC><REC><CO_I>99C50003</CO_I><CO_N>������</CO_N><L_SET>2114-07-05</L_SET><PR_C>302.6</PR_C><BID>280.8</BID><BI_D>193</BI_D><OFFER>281</OFFER><OF_D>776</OF_D><HIGH>305.8</HIGH><LOW>279</LOW><LAST>281</LAST><AVG>292.6</AVG><CHA>-21.6</CHA><VO_T>1395868</VO_T><TT_O>567052</TT_O><CR_T>20140804155954</CR_T></REC><REC><CO_I>99BRCM</CO_I><CO_N>�Ⱦ�����ԭ</CO_N><L_SET>2111-06-17</L_SET><PR_C>3280</PR_C><BID>3261</BID><BI_D>1</BI_D><OFFER>3290</OFFER><OF_D>1</OF_D><HIGH>3289</HIGH><LOW>3274</LOW><LAST>3285</LAST><AVG>3284</AVG><CHA>5</CHA><VO_T>6308</VO_T><TT_O>4644</TT_O><CR_T>20140804155538</CR_T></REC><REC><CO_I>99BAG</CO_I><CO_N>����</CO_N><L_SET>2114-06-01</L_SET><PR_C>3680</PR_C><BID>3684</BID><BI_D>4</BI_D><OFFER>3690</OFFER><OF_D>5</OF_D><HIGH>3688</HIGH><LOW>3670</LOW><LAST>3688</LAST><AVG>3678</AVG><CHA>8</CHA><VO_T>29804</VO_T><TT_O>16866</TT_O><CR_T>20140804155919</CR_T></REC><REC><CO_I>99C30002</CO_I><CO_N>��������</CO_N><L_SET>2114-06-27</L_SET><PR_C>28.01</PR_C><BID>28.14</BID><BI_D>11863</BI_D><OFFER>28.15</OFFER><OF_D>228</OF_D><HIGH>28.88</HIGH><LOW>28.03</LOW><LAST>28.15</LAST><AVG>28.49</AVG><CHA>0.14</CHA><VO_T>1214156</VO_T><TT_O>1020028</TT_O><CR_T>20140804155959</CR_T></REC><REC><CO_I>99C50005</CO_I><CO_N>ę́�����</CO_N><L_SET>2114-07-10</L_SET><PR_C>307.8</PR_C><BID>306</BID><BI_D>1176</BI_D><OFFER>306.4</OFFER><OF_D>73</OF_D><HIGH>310.8</HIGH><LOW>304.6</LOW><LAST>306.2</LAST><AVG>306.4</AVG><CHA>-1.6</CHA><VO_T>337394</VO_T><TT_O>1274288</TT_O><CR_T>20140804155952</CR_T></REC><REC><CO_I>99CM0001</CO_I><CO_N>���</CO_N><L_SET>2114-05-01</L_SET><PR_C>55.6</PR_C><BID>54.3</BID><BI_D>383</BI_D><OFFER>54.35</OFFER><OF_D>615</OF_D><HIGH>55.55</HIGH><LOW>54.2</LOW><LAST>54.3</LAST><AVG>54.8</AVG><CHA>-1.3</CHA><VO_T>86164</VO_T><TT_O>188146</TT_O><CR_T>20140804155959</CR_T></REC><REC><CO_I>99BPBCD</CO_I><CO_N>�߲ĳɶ�</CO_N><L_SET>2112-08-11</L_SET><PR_C>3090</PR_C><BID>3030</BID><BI_D>3</BI_D><OFFER>3090</OFFER><OF_D>19</OF_D><HIGH>3086</HIGH><LOW>3080</LOW><LAST>3084</LAST><AVG>3084</AVG><CHA>-6</CHA><VO_T>8644</VO_T><TT_O>476</TT_O><CR_T>20140804133433</CR_T></REC><REC><CO_I>99BQT</CO_I><CO_N>��ī����������</CO_N><L_SET>2114-06-10</L_SET><PR_C>2306</PR_C><BID>2310</BID><BI_D>7</BI_D><OFFER>2312</OFFER><OF_D>129</OF_D><HIGH>2326</HIGH><LOW>2302</LOW><LAST>2310</LAST><AVG>2312</AVG><CHA>4</CHA><VO_T>40240</VO_T><TT_O>14102</TT_O><CR_T>20140804155947</CR_T></REC><REC><CO_I>99BMADD</CO_I><CO_N>���׵���</CO_N><L_SET>2114-02-23</L_SET><PR_C>2190</PR_C><BID>2198</BID><BI_D>306</BI_D><OFFER>2200</OFFER><OF_D>15</OF_D><HIGH>2203</HIGH><LOW>2190</LOW><LAST>2198</LAST><AVG>2198</AVG><CHA>8</CHA><VO_T>102988</VO_T><TT_O>1160</TT_O><CR_T>20140804155959</CR_T></REC><REC><CO_I>99BRSSRV</CO_I><CO_N>�̽�Ƭ�𽺹�</CO_N><L_SET>2114-06-08</L_SET><PR_C>11785</PR_C><BID>11840</BID><BI_D>1</BI_D><OFFER>11845</OFFER><OF_D>7</OF_D><HIGH>11855</HIGH><LOW>11760</LOW><LAST>11840</LAST><AVG>11825</AVG><CHA>55</CHA><VO_T>9258</VO_T><TT_O>17642</TT_O><CR_T>20140804155952</CR_T></REC><REC><CO_I>99CT0008</CO_I><CO_N>������</CO_N><L_SET>2114-07-12</L_SET><PR_C>433.9</PR_C><BID>423.3</BID><BI_D>1</BI_D><OFFER>433</OFFER><OF_D>1</OF_D><HIGH>446.9</HIGH><LOW>425.3</LOW><LAST>425.7</LAST><AVG>441.4</AVG><CHA>-8.2</CHA><VO_T>9212</VO_T><TT_O>1164</TT_O><CR_T>20140804155957</CR_T></REC><REC><CO_I>99BRBWX</CO_I><CO_N>���Ƹ�����</CO_N><L_SET>2114-05-30</L_SET><PR_C>3058</PR_C><BID>2950</BID><BI_D>1</BI_D><OFFER>3070</OFFER><OF_D>2</OF_D><HIGH>2930</HIGH><LOW>2930</LOW><LAST>2930</LAST><AVG>2930</AVG><CHA>-128</CHA><VO_T>72</VO_T><TT_O>246</TT_O><CR_T>20140804151033</CR_T></REC><REC><CO_I>99CT0007</CO_I><CO_N>�ն���</CO_N><L_SET>2114-08-03</L_SET><PR_C>143.3</PR_C><BID>138.4</BID><BI_D>118</BI_D><OFFER>138.5</OFFER><OF_D>192</OF_D><HIGH>151.8</HIGH><LOW>136.8</LOW><LAST>138.4</LAST><AVG>141.3</AVG><CHA>-4.9</CHA><VO_T>4789848</VO_T><TT_O>541352</TT_O><CR_T>20140804155958</CR_T></REC><REC><CO_I>99CM0004</CO_I><CO_N>��ɽ����</CO_N><L_SET>2114-08-05</L_SET><PR_C>288.5</PR_C><BID>0</BID><BI_D>0</BI_D><OFFER>280</OFFER><OF_D>1260</OF_D><HIGH>297</HIGH><LOW>280</LOW><LAST>280</LAST><AVG>287.5</AVG><CHA>-8.5</CHA><VO_T>73126</VO_T><TT_O>87806</TT_O><CR_T>20140804155927</CR_T></REC><REC><CO_I>99G20001</CO_I><CO_N>�۱�ϩ��˿������</CO_N><L_SET>2114-07-12</L_SET><PR_C>9617</PR_C><BID>9620</BID><BI_D>10</BI_D><OFFER>9630</OFFER><OF_D>30</OF_D><HIGH>9650</HIGH><LOW>9600</LOW><LAST>9649</LAST><AVG>9640</AVG><CHA>32</CHA><VO_T>13018</VO_T><TT_O>13992</TT_O><CR_T>20140804154332</CR_T></REC><REC><CO_I>99CM0002</CO_I><CO_N>���˽�</CO_N><L_SET>2114-05-07</L_SET><PR_C>19.54</PR_C><BID>19.52</BID><BI_D>25</BI_D><OFFER>19.54</OFFER><OF_D>83</OF_D><HIGH>19.8</HIGH><LOW>19.42</LOW><LAST>19.54</LAST><AVG>19.64</AVG><CHA>0</CHA><VO_T>85222</VO_T><TT_O>114092</TT_O><CR_T>20140804155955</CR_T></REC><REC><CO_I>99BMU</CO_I><CO_N>�㹽</CO_N><L_SET>2114-07-01</L_SET><PR_C>91.2</PR_C><BID>91.3</BID><BI_D>15</BI_D><OFFER>91.35</OFFER><OF_D>36</OF_D><HIGH>91.65</HIGH><LOW>90</LOW><LAST>91.3</LAST><AVG>91.25</AVG><CHA>0.1</CHA><VO_T>709114</VO_T><TT_O>1265062</TT_O><CR_T>20140804155941</CR_T></REC><REC><CO_I>99CM0006</CO_I><CO_N>����</CO_N><L_SET>2114-07-24</L_SET><PR_C>27.8</PR_C><BID>27</BID><BI_D>795</BI_D><OFFER>27.02</OFFER><OF_D>1633</OF_D><HIGH>28.8</HIGH><LOW>26.32</LOW><LAST>27</LAST><AVG>26.8</AVG><CHA>-0.8</CHA><VO_T>2537762</VO_T><TT_O>1203284</TT_O><CR_T>20140804155958</CR_T></REC><REC><CO_I>99BPPMM</CO_I><CO_N>�۱�ϩï��</CO_N><L_SET>2114-03-20</L_SET><PR_C>10871</PR_C><BID>0</BID><BI_D>0</BI_D><OFFER>11500</OFFER><OF_D>2</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>10871</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>4</TT_O><CR_T>20140804093149</CR_T></REC><REC><CO_I>99B50018</CO_I><CO_N>��ľ���̫�ָ�</CO_N><L_SET>2114-07-22</L_SET><PR_C>2093</PR_C><BID>2089</BID><BI_D>22</BI_D><OFFER>2108</OFFER><OF_D>6</OF_D><HIGH>2120</HIGH><LOW>2082</LOW><LAST>2090</LAST><AVG>2100</AVG><CHA>-3</CHA><VO_T>105164</VO_T><TT_O>9464</TT_O><CR_T>20140804155835</CR_T></REC><REC><CO_I>99B10008</CO_I><CO_N>�⾫��</CO_N><L_SET>2114-05-27</L_SET><PR_C>1190</PR_C><BID>1185</BID><BI_D>436</BI_D><OFFER>1186</OFFER><OF_D>562</OF_D><HIGH>1194</HIGH><LOW>1182</LOW><LAST>1186</LAST><AVG>1186</AVG><CHA>-4</CHA><VO_T>211572</VO_T><TT_O>19818</TT_O><CR_T>20140804155954</CR_T></REC><REC><CO_I>99B10005</CO_I><CO_N>����úɽ��</CO_N><L_SET>2114-03-27</L_SET><PR_C>588</PR_C><BID>588</BID><BI_D>26</BI_D><OFFER>590</OFFER><OF_D>152</OF_D><HIGH>590</HIGH><LOW>585</LOW><LAST>589</LAST><AVG>587</AVG><CHA>1</CHA><VO_T>59790</VO_T><TT_O>131450</TT_O><CR_T>20140804155538</CR_T></REC><REC><CO_I>99B50017</CO_I><CO_N>��̿</CO_N><L_SET>2114-06-07</L_SET><PR_C>3200</PR_C><BID>3170</BID><BI_D>1</BI_D><OFFER>3204</OFFER><OF_D>51</OF_D><HIGH>3208</HIGH><LOW>3197</LOW><LAST>3203</LAST><AVG>3202</AVG><CHA>3</CHA><VO_T>21000</VO_T><TT_O>1284</TT_O><CR_T>20140804155813</CR_T></REC><REC><CO_I>99BRBW</CO_I><CO_N>���Ƹ�����</CO_N><L_SET>2112-03-09</L_SET><PR_C>2993</PR_C><BID>2935</BID><BI_D>1</BI_D><OFFER>3040</OFFER><OF_D>4</OF_D><HIGH>3044</HIGH><LOW>2916</LOW><LAST>3044</LAST><AVG>2980</AVG><CHA>51</CHA><VO_T>12</VO_T><TT_O>93974</TT_O><CR_T>20140804155010</CR_T></REC><REC><CO_I>99BNI</CO_I><CO_N>�����</CO_N><L_SET>2114-05-17</L_SET><PR_C>129.1</PR_C><BID>128.6</BID><BI_D>73</BI_D><OFFER>128.7</OFFER><OF_D>23</OF_D><HIGH>129.25</HIGH><LOW>128.6</LOW><LAST>128.7</LAST><AVG>129</AVG><CHA>-0.4</CHA><VO_T>302568</VO_T><TT_O>238154</TT_O><CR_T>20140804155957</CR_T></REC><REC><CO_I>99B50013</CO_I><CO_N>��������</CO_N><L_SET>2114-04-23</L_SET><PR_C>223.5</PR_C><BID>217</BID><BI_D>15453</BI_D><OFFER>218</OFFER><OF_D>8170</OF_D><HIGH>222.5</HIGH><LOW>217</LOW><LAST>217</LAST><AVG>219</AVG><CHA>-6.5</CHA><VO_T>352770</VO_T><TT_O>2931916</TT_O><CR_T>20140804155958</CR_T></REC><REC><CO_I>99BCXJ</CO_I><CO_N>�޻��½�</CO_N><L_SET>2114-02-23</L_SET><PR_C>16000</PR_C><BID>0</BID><BI_D>0</BI_D><OFFER>0</OFFER><OF_D>0</OF_D><HIGH>0</HIGH><LOW>0</LOW><LAST>0</LAST><AVG>16000</AVG><CHA>0</CHA><VO_T>0</VO_T><TT_O>174</TT_O><CR_T>20140804090000</CR_T></REC><REC><CO_I>99BPVAXW</CO_I><CO_N>PVA��ά</CO_N><L_SET>2113-08-30</L_SET><PR_C>11.41</PR_C><BID>11.42</BID><BI_D>22</BI_D><OFFER>11.43</OFFER><OF_D>328</OF_D><HIGH>11.44</HIGH><LOW>11.37</LOW><LAST>11.42</LAST><AVG>11.41</AVG><CHA>0.01</CHA><VO_T>37954</VO_T><TT_O>26740</TT_O><CR_T>20140804155836</CR_T></REC><REC><CO_I>99B50010</CO_I><CO_N>Ѽ��</CO_N><L_SET>2114-07-01</L_SET><PR_C>227</PR_C><BID>219</BID><BI_D>7483</BI_D><OFFER>220</OFFER><OF_D>39</OF_D><HIGH>225</HIGH><LOW>219</LOW><LAST>220</LAST><AVG>223</AVG><CHA>-7</CHA><VO_T>891682</VO_T><TT_O>3210946</TT_O><CR_T>20140804155949</CR_T></REC><REC><CO_I>99B50011</CO_I><CO_N>��֬</CO_N><L_SET>2114-05-25</L_SET><PR_C>12.59</PR_C><BID>12.58</BID><BI_D>116</BI_D><OFFER>12.61</OFFER><OF_D>45</OF_D><HIGH>12.62</HIGH><LOW>12.57</LOW><LAST>12.61</LAST><AVG>12.61</AVG><CHA>0.02</CHA><VO_T>327026</VO_T><TT_O>305426</TT_O><CR_T>20140804155957</CR_T></REC><REC><CO_I>99BRC</CO_I><CO_N>�Ⱦ���</CO_N><L_SET>2113-05-21</L_SET><PR_C>3225</PR_C><BID>3201</BID><BI_D>2</BI_D><OFFER>3300</OFFER><OF_D>2</OF_D><HIGH>3300</HIGH><LOW>3230</LOW><LAST>3250</LAST><AVG>3264</AVG><CHA>25</CHA><VO_T>46</VO_T><TT_O>2008</TT_O><CR_T>20140804153430</CR_T></REC></RESULTLIST></REP></MEBS_MOBILE>";
		XMLMatcher matcher = new XMLMatcher(test, "CO_N");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
