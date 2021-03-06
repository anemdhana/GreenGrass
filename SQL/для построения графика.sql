select o.id, o.name, max(t.id), round(avg(t.n1),2) as n1, to_char(t.ts,'HH24:MI') from A_OBJXPROP t, t_objxprop x, t_obj o where 
x.fk_prop='LAST_5MIN_VOL' and t.fk_prop_id=x.id and o.id<>541 and x.fk_obj = o.id and to_char(t.ts,'YYYYMMDD')>='20150530'
group by o.id, o.name, to_char(t.ts,'HH24:MI')
order by o.id, max(t.id)
