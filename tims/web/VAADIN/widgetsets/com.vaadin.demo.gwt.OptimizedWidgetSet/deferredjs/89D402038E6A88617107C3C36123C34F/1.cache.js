function Et(){}
function zt(){}
function QN(){}
function PN(){}
function SP(){}
function oQ(){}
function tQ(){}
function EQ(){}
function cX(){}
function eX(b){this.b=b}
function B1(b){XY(this);JY(this,b)}
function ZP(b,c){return ZJ(b.e,b,c)}
function iy(b,c,d,e){gy(b,c);b.sc(c,d,e)}
function FQ(b){this.b=new L2;this.c=b}
function pQ(b,c){this.b=b;this.i=c;this.c=y8}
function dX(b,c){return b.b<c.b?-1:b.b>c.b?1:0}
function Zx(b,c){if(c<0||c>b.F.d){throw new _W}}
function pX(){pX=i3;oX=fl(Hs,{27:1,32:1},82,256,0)}
function fy(b,c){var d;Dx(c);d=b.F.d;b.sc(c,0,0);_x(b,c,b.sb,d)}
function _x(b,c,d,e){e=Yx(b,c,e);Dx(c);FE(b.F,c,e);Gw(d,c.sb,e);Fx(c,b)}
function Yx(b,c,d){var e;Zx(b,d);if(c.rb==b){e=EE(b.F,c);e<d&&--d}return d}
function wQ(b){var c;if(b.c){c=b.c.u.Xc()+DV(b.c);return c}else{return 0}}
function zQ(b){if(!b.d){return false}if(b.i){return false}else{yQ(b);return true}}
function gy(b,c){if(c.rb!=b){throw new UW('Widget must be a child of this panel.')}}
function CQ(b,c){this.n=b;this.j=c[1][r8];this.e=c[1][s8];AQ(this,c)}
function _P(b){var c,d;for(d=K2(b,0);d.c!=d.e.b;){c=pl(R2(d),77);yQ(c)}}
function aQ(b){var c,d;for(d=K2(b,0);d.c!=d.e.b;){c=pl(R2(d),77);if(!c.g){yQ(c);S2(d)}}}
function JY(b,c){var d,e;for(e=c.od().rc();e.Wb();){d=pl(e.Xb(),48);b.qd(d.xd(),d.yd())}}
function vQ(b){var c,d;d=b.n.i[b.e];for(c=1;c<b.f;++c){d+=b.n.x+b.n.i[b.e+c]}return d}
function uQ(b){var c,d;c=b.n.u[b.j];for(d=1;d<b.k;++d){c+=b.n.y+b.n.u[b.j+d]}return c}
function eQ(b){var c,d;c=fl(rs,{27:1},-1,b.length,1);for(d=0;d<c.length;++d){c[d]=b[d]}return c}
function ky(){ly.call(this,$doc.createElement(U4));this.sb.style[J4]=D5;this.sb.style[x5]=s5}
function jy(b,c,d){var e;e=b.sb;if(c==-1&&d==-1){my(e)}else{e.style[J4]=y5;e.style[H4]=c+A4;e.style[I4]=d+A4}}
function YP(b,c){var d,e,f;f=c[1][r8];e=c[1][s8];d=b.c[e][f];if(!d){d=new CQ(b,c);b.c[e][f]=d}else{AQ(d,c)}return d}
function _Z(b,c){var d,e;for(d=0,e=b.c;d<e;++d){if(!c?Z$(b,d)==null:(c==null?null:c)===tl(Z$(b,d))){return d}}return -1}
function nX(b){var c,d;if(b>-129&&b<128){c=b+128;d=(pX(),oX)[c];!d&&(d=oX[c]=new eX(b));return d}return new eX(b)}
function xQ(b,c,d){if(!!b.c&&b.c.ob){iy(b.n.b,b.c,c,d);IV(b.c,vQ(b),uQ(b));b.c.b=new jO(b.b);MV(b.c,vQ(b),uQ(b))}}
function Gt(){Ct=new Et;Pb((Nb(),Mb),1);!!$stats&&$stats(sc(p8,r3,-1,-1));Ct.Ub();!!$stats&&$stats(sc(p8,q8,-1,-1))}
function gl(b,c,d,e,f,g,i){var k,n,o,p;o=e[f];n=f==g-1;p=dl(n?i:0,o);ll();nl(p,jl,kl);p.aC=b[f];p.cM=c[f];p.qI=d[f];if(!n){++f;for(k=0;k<o;++k){p[k]=gl(b,c,d,e,f,g,i)}}return p}
function Dt(){var b,c,d;while(At){d=kb;At=At.b;!At&&(Bt=null);if(!d){(DN(),CN).qd(rq,new QN);XF()}else{try{(DN(),CN).qd(rq,new QN);XF()}catch(b){b=Ps(b);if(rl(b,34)){c=b;RK.Mc(c)}else throw b}}}}
function BQ(b,c){if(!!c&&!Boolean(c[1][g6])){B4 in c[1]&&c[1][B4].indexOf(X5)!=-1?(b.g=true):(b.g=false);if(z4 in c[1]){b.o=b.i=c[1][z4].indexOf(X5)!=-1;B4 in c[1]&&(b.o=false)}else{b.o=!(B4 in c[1]);b.i=false}}}
function bQ(b,c){var d,e,f,g;d=null;for(f=K2(b.g,0);f.c!=f.e.b;){e=pl(R2(f),105);if(e.c<c.f){continue}else{d=e;break}}if(!d){d=new FQ(c.f);I2(b.g,d)}else if(d.c!=c.f){g=new FQ(c.f);Y$(b.g,_Z(b.g,d),g);d=g}G2(d.b,c)}
function cQ(b,c){var d,e,f,g;d=null;for(f=K2(b.v,0);f.c!=f.e.b;){e=pl(R2(f),105);if(e.c<c.k){continue}else{d=e;break}}if(!d){d=new FQ(c.k);I2(b.v,d)}else if(d.c!=c.k){g=new FQ(c.k);Y$(b.v,_Z(b.v,d),g);d=g}G2(d.b,c)}
function dQ(){this.sb=$doc.createElement(U4);this.k=$doc.createElement(U4);this.b=new ky;this.z=new z1;this.r=new z1;this.d=new pQ(this,this);this.g=new L2;this.v=new L2;this.sb.appendChild(this.k);this.sb[C4]='v-gridlayout';SA(this,this.b)}
function TP(b){var c,d,e;for(d=0;d<b.c.length;++d){for(e=0;e<b.c[d].length;++e){c=b.c[d][e];if(c){if(!!c.c&&c.o){c.c.sb.style[z4]=vQ(c)+A4;QV(c.c)}c.k==1?!c.g&&b.u[e]<(c.c?c.c.u.Wc()+AV(c.c):0)&&(b.u[e]=c.c?c.c.u.Wc()+AV(c.c):0):cQ(b,c)}}}VP(b);b.p=eQ(b.u)}
function XP(b){var c,d,e,f,g,i,k;if(!GX(n3,b.j)){k=b.p[0];for(i=1;i<b.p.length;++i){k+=b.y+b.p[i]}c=(parseInt(b.sb[E4])||0)-b.n;g=c-k;e=0;if(g>0){for(i=0;i<b.u.length;++i){f=~~(g*b.t[i]/1000);b.u[i]=b.p[i]+f;e+=f}g-=e;d=0;while(g>0){++b.u[d%b.u.length];--g;++d}}}}
function WP(b){var c,d,e,f,g,i,k;if(!GX(n3,b.A)){k=b.o[0];for(i=1;i<b.o.length;++i){k+=b.x+b.o[i]}b.b.sb.style[z4]=n3;c=parseInt(b.b.sb[F4])||0;g=c-k;e=0;if(g>0){for(i=0;i<b.i.length;++i){f=~~(g*b.f[i]/1000);b.i[i]=b.o[i]+f;e+=f}g-=e;d=0;while(g>0){++b.i[d%b.i.length];--g;++d}}}}
function $P(b){var c,d,e,f,g,i;g=0;i=0;for(e=0;e<b.c.length;++e){i=0;for(f=0;f<b.c[e].length;++f){d=b.c[e][f];!!d&&xQ(d,g,i);i+=b.u[f]+b.y}g+=b.i[e]+b.x}GX(n3,b.A)?(b.b.sb.style[z4]=g-b.x+A4,undefined):(b.b.sb.style[z4]=n3,undefined);if(GX(n3,b.j)){c=i-b.y}else{c=(parseInt(b.sb[E4])||0)-b.n;c<0&&(c=0)}b.b.sb.style[B4]=c+A4}
function UP(b){var c,d,e,f,g,i,k,n,o,p;for(k=K2(b.g,0);k.c!=k.e.b;){i=pl(R2(k),105);for(e=K2(i.b,0);e.c!=e.e.b;){d=pl(R2(e),77);p=d.i?0:wQ(d);c=b.i[d.e];for(g=1;g<d.f;++g){c+=b.x+b.i[d.e+g]}if(c<p){n=p-c;o=~~(n/d.f);for(g=0;g<d.f;++g){f=d.e+g;b.i[f]+=o;n-=o}if(n>0){for(g=0;g<d.f;++g){f=d.e+g;b.i[f]+=1;n-=1;if(n==0){break}}}}}}}
function VP(b){var c,d,e,f,g,i,k,n,o,p;for(k=K2(b.v,0);k.c!=k.e.b;){i=pl(R2(k),105);for(e=K2(i.b,0);e.c!=e.e.b;){d=pl(R2(e),77);f=d.g?0:d.c?d.c.u.Wc()+AV(d.c):0;c=b.u[d.j];for(g=1;g<d.k;++g){c+=b.y+b.u[d.j+g]}if(c<f){n=f-c;p=~~(n/d.k);for(g=0;g<d.k;++g){o=d.j+g;b.u[o]+=p;n-=p}if(n>0){for(g=0;g<d.k;++g){o=d.j+g;b.u[o]+=1;n-=1;if(n==0){break}}}}}}}
function yQ(b){var c;c=tG(b.n.e,b.d);if(!b.c||b.c.s!=c){if(b.n.z.nd(c)){b.c=pl(b.n.z.pd(c),104);b.c.sb.style[z4]=n3;b.c.sb.style[B4]=n3;KV(b.c,pl(c,58))}else{b.c=new SV(pl(c,58),0);b.n.z.qd(pl(c,58),b.c);b.c.sb.style[z4]=n3;fy(b.n.b,b.c)}b.n.r.qd(c,b)}GV(b.c,b.d,b.n.e,-1);b.n.w&&(RJ(),Boolean(b.d[1][g6]))&&yG(b.n.e,b.c.s);QV(b.c);b.n.q.rd(c)}
function AQ(b,c){var d,e,f;b.f=v8 in c[1]?c[1][v8]:1;b.k=w8 in c[1]?c[1][w8]:1;for(d=0;d<b.f;++d){for(e=0;e<b.k;++e){(d>0||e>0)&&(b.n.c[b.e+d][b.j+e]=null)}}c=c[2];if(b.d){if(!c){b.c=null}else if(!!b.c&&b.c.s!=tG(b.n.e,c)){b.c=null;f=tG(b.n.e,c);if(b.n.z.nd(f)){b.c=pl(b.n.z.pd(f),104);b.c.sb.style[z4]=n3;b.c.sb.style[B4]=n3;b.n.r.qd(f,b)}}}b.d=c;BQ(b,c)}
var z8='VGridLayout$Cell;',w8='h',p8='runCallbacks1',v8='w',s8='x',r8='y';_=Et.prototype=zt.prototype=new J;_.gC=function Ft(){return fn};_.Ub=function Jt(){Dt()};_.cM={};_=ky.prototype=$w.prototype;_.sc=function py(b,c,d){jy(b,c,d)};_=nC.prototype;_.sc=function qC(b,c,d){c-=Nd($doc);d-=Od($doc);jy(b,c,d)};_=QN.prototype=PN.prototype=new J;_._c=function RN(){return new dQ};_.gC=function SN(){return Tp};_.cM={102:1};_=dQ.prototype=SP.prototype=new QA;_.Qc=function fQ(b){var c;c=pl(this.r.pd(b),77);return new sJ(vQ(c)-DV(c.c),uQ(c)-AV(c.c))};_.gC=function gQ(){return rq};_.yc=function hQ(){return this.k};_.Rc=function iQ(b,c){var d;d=pl(this.z.rd(b),104);if(!d){return}KV(d,c);this.z.qd(c,d);this.r.qd(pl(c,24),pl(this.r.pd(b),77))};_.Sc=function jQ(b){var c,d,e,f,g,i,k,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B;r=false;w=false;x=false;s=parseInt(this.b.sb[E4])||0;t=parseInt(this.b.sb[F4])||0;(GX(n3,this.A)||GX(n3,this.j))&&(r=true);i=new o_;k=new o_;for(v=b.rc();v.Wb();){u=pl(v.Xb(),24);d=pl(this.r.pd(u),77);if(!d.g||!d.i){d.c.sb.style[z4]=n3;d.c.sb.style[B4]=n3;QV(d.c);OV(d.c);B=wQ(d);c=this.i[d.e];for(p=1;p<d.f;++p){c+=this.x+this.i[d.e+p]}if(c<B){r=true;d.f==1?(this.i[d.e]=this.o[d.e]=B):(w=true)}else c!=B&&f_(i,nX(d.e));o=d.c?d.c.u.Wc()+AV(d.c):0;c=this.u[d.j];for(p=1;p<d.k;++p){c+=this.y+this.u[d.j+p]}if(c<o){r=true;d.k==1?(this.u[d.j]=this.p[d.j]=o):(x=true)}else c!=o&&f_(k,nX(d.j))}}if(i.c>0){for(f=new p$(i);f.c<f.e.kd();){e=pl(n$(f),82);g=0;for(p=0;p<this.u.length;++p){d=this.c[e.b][p];if(!!d&&!!d.d&&!d.i&&d.f==1){B=wQ(d);B>g&&(g=B)}}this.o[e.b]=g}r=true;this.i=eQ(this.o);UP(this);w=false}w&&UP(this);if(k.c>0){r=true;for(A=new p$(k);A.c<A.e.kd();){z=pl(n$(A),82);y=this.p[z.b]=0;for(p=0;p<this.i.length;++p){d=this.c[p][z.b];if(!!d&&!!d.d&&!d.g&&d.k==1){n=d.c?d.c.u.Wc()+AV(d.c):0;n>y&&(y=n)}}this.p[z.b]=y}this.u=eQ(this.p);VP(this);x=false}x&&VP(this);if(r){WP(this);XP(this);$P(this);for(p=0;p<this.c.length;++p){for(q=0;q<this.c[p].length;++q){d=this.c[p][q];!!d&&!!d.c&&(d.g||d.i)&&yG(this.e,d.c.s)}}}return !((parseInt(this.b.sb[E4])||0)!=s||(parseInt(this.b.sb[F4])||0)!=t)};_.ec=function kQ(b){var c,d,e,f;this.sb.style[B4]=b;if(!GX(b,this.j)){this.j=b;if(this.s){this.w=true}else{XP(this);$P(this);for(d=(e=IY(this.r).c.rc(),new G$(e));d.b.Wb();){c=pl((f=pl(d.b.Xb(),48),f.xd()),24);yG(this.e,pl(c,58))}}}};_.hc=function lQ(b){var c,d,e,f,g,i,k,n,o,p,q,r,s,t,u,v,w,x,y,z;this.sb.style[z4]=b;if(!GX(b,this.A)){this.A=b;if(this.s){this.w=true}else{s=eQ(this.i);WP(this);k=false;i=null;for(n=0;n<s.length;++n){if(this.i[n]!=s[n]){g=this.c[n];for(o=0;o<g.length;++o){c=g[o];if(!!c&&!!c.c&&c.o){IV(c.c,vQ(c),uQ(c));yG(this.e,c.c.s);QV(c.c);p=c.c?c.c.u.Wc()+AV(c.c):0;if(this.i[n]<s[n]&&p>this.p[o]&&c.k==1){this.p[o]=p;if(p>this.u[o]){this.u[o]=p;k=true}}else if(p<this.p[o]){!i&&(i=new H1);G1(i,nX(o))}}}}}if(i){v=false;for(u=(w=IY(i.b).c.rc(),new G$(w));u.b.Wb();){t=pl((x=pl(u.b.Xb(),48),x.xd()),82);r=this.p[t.b];q=0;for(f=0;f<this.i.length;++f){e=this.c[f][t.b];!!e&&!e.g&&(e.c?e.c.u.Wc()+AV(e.c):0)>q&&(q=e.c?e.c.u.Wc()+AV(e.c):0)}if(q<r){this.p[t.b]=this.u[t.b]=q;v=true}}if(v){VP(this);this.p=eQ(this.u);k=true}}$P(this);for(d=(y=IY(this.r).c.rc(),new G$(y));d.b.Wb();){c=pl((z=pl(d.b.Xb(),48),z.xd()),24);yG(this.e,pl(c,58))}k&&GX(n3,this.j)&&fK(this,false)}}};_.Tc=function mQ(b,c){var d;d=pl(this.z.pd(b),104);!!d&&NV(d,c,this.e);if(!this.s){BQ(pl(this.r.pd(b),77),c);f_(this.e.d,b)}};_.Vc=function nQ(b,c){var d,e,f,g,i,k,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F;this.s=true;this.e=c;if(TG(c,this,b,true)){this.s=false;return}nO(this.d,c);this.b.sb.style[z4]=o5;z=new YQ(b[1][t8]);A='v-gridlayout-margin';(z.b&1)==1&&(A+=' v-gridlayout-margin-top');(z.b&2)==2&&(A+=' v-gridlayout-margin-right');(z.b&4)==4&&(A+=' v-gridlayout-margin-bottom');(z.b&8)==8&&(A+=' v-gridlayout-margin-left');this.k.className=A;this.n=(this.k.offsetHeight||0)-(parseInt(this.b.sb[E4])||0);B=$doc.createElement(U4);B.className='v-gridlayout-spacing-'+(Boolean(b[1][u8])?Q4:'off');B.style[z4]=Z3;B.style[B4]=Z3;this.b.sb.appendChild(B);this.x=B.offsetWidth||0;this.y=B.offsetHeight||0;this.b.sb.removeChild(B);n=b[1][v8];v=b[1][w8];this.i=fl(rs,{27:1},-1,n,1);this.u=fl(rs,{27:1},-1,v,1);if(this.c==null){this.c=gl([Ns,Es],[{27:1,32:1},{27:1,31:1,32:1}],[31,77],[n,v],0,2,0)}else if(this.c.length!=n||this.c[0].length!=v){q=gl([Ns,Es],[{27:1,32:1},{27:1,31:1,32:1}],[31,77],[n,v],0,2,0);for(o=0;o<this.c.length;++o){for(p=0;p<this.c[o].length;++p){o<n&&p<v&&(q[o][p]=this.c[o][p])}}this.c=q}this.q=new B1(this.z);e=yN(b[1],x8);d=0;r=new L2;t=new L2;for(o=new HJ(b);C=o.c.length-2,C>o.b+1;){s=ql(GJ(o));if(GX('gr',s[0])){for(p=new HJ(s);D=p.c.length-2,D>p.b+1;){f=ql(GJ(p));if(GX('gc',f[0])){g=YP(this,f);if(g.d){u=zQ(g);g.b=e[d++];u||(new c3(g,r.b),++r.c,true);g.f>1?bQ(this,g):u&&this.i[g.e]<wQ(g)&&(this.i[g.e]=wQ(g));g.g&&(new c3(g,t.b),++t.c,true)}}}}}UP(this);this.f=yN(b[1],'colExpand');this.t=yN(b[1],'rowExpand');this.o=eQ(this.i);WP(this);aQ(r);TP(this);XP(this);_P(r);for(i=K2(t,0);i.c!=i.e.b;){g=pl(R2(i),77);y=g.c.s;xG(c,c.i[y.sb.tkPid]);QV(g.c)}$P(this);for(x=(E=IY(this.q).c.rc(),new G$(E));x.b.Wb();){w=pl((F=pl(x.b.Xb(),48),F.xd()),58);k=pl(this.z.pd(w),104);this.r.rd(w);this.z.rd(w);Dx(k);SG(c,pl(w,24))}this.q=null;this.s=false;this.w=false};_.cM={9:1,12:1,13:1,15:1,17:1,18:1,19:1,20:1,22:1,24:1,30:1,58:1,71:1,73:1,74:1};_.c=null;_.e=null;_.f=null;_.i=null;_.j=null;_.n=0;_.o=null;_.p=null;_.q=null;_.s=false;_.t=null;_.u=null;_.w=false;_.x=0;_.y=0;_.A=null;_=pQ.prototype=oQ.prototype=new NO;_.cd=function qQ(b){return ZP(this.b,b)};_.gC=function rQ(){return oq};_.bd=function sQ(b,c){return xx(this.b,b,c)};_.cM={11:1,36:1,38:1,41:1};_.b=null;_=CQ.prototype=tQ.prototype=new J;_.gC=function DQ(){return pq};_.cM={77:1};_.b=0;_.c=null;_.d=null;_.e=0;_.f=1;_.g=false;_.i=false;_.j=0;_.k=1;_.n=null;_.o=false;_=FQ.prototype=EQ.prototype=new J;_.gC=function GQ(){return qq};_.cM={105:1};_.c=0;_=LW.prototype;_.gC=function QW(){return sr};_=eX.prototype=cX.prototype=new LW;_.cT=function fX(b){return dX(this,pl(b,82))};_.eQ=function gX(b){return b!=null&&b.cM&&!!b.cM[82]&&pl(b,82).b==this.b};_.gC=function hX(){return pr};_.hC=function iX(){return this.b};_.tS=function mX(){return n3+this.b};_.cM={27:1,29:1,82:1,83:1};_.b=0;var oX;_=B1.prototype=y1.prototype;var fn=EW(f8,'AsyncLoader1'),Tp=EW(l8,'WidgetMapImpl$3$1'),pq=EW(m8,'VGridLayout$Cell'),Es=DW(n8,z8),Ns=DW('[[Lcom.vaadin.terminal.gwt.client.ui.',z8),oq=EW(m8,'VGridLayout$1'),qq=EW(m8,'VGridLayout$SpanList'),sr=EW(T7,'Number'),pr=EW(T7,'Integer'),Hs=DW(Y7,'Integer;');k3(Gt)();