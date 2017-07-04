# Storage
Задача болты и гайки

Болты и гайки

(Время: 1 сек. Память: 16 Мб)

Вновь созданная фирма купила заброшенные склады на окраине города. Новому

заведующему складами поручили произвести учёт в короткие сроки. Всё шло хорошо,

пока случайно не рассыпали контейнеры с болтами и гайками на каждом складе, после

чего собрали их в общие (для болтов и гаек) контейнеры, потеряв при этом несколько

деталей.

Помогите оценить нанесённый ущерб на каждом складе, приняв во внимание, что,

помимо потерянных деталей, болт (или гайка) считается непригодным, если он не имеет

соответствующей гайки (или болта).

Входные данные

Во входном файле INPUT.TXT описано текущее положение на складе. В первой строке

через пробел записаны три целых числа: k1, l1, m1 – начальное число болтов

(100&lt;=k1&lt;=30000, k1 кратно 100), процент потерянных деталей (0&lt;=l1&lt;=100) и стоимость

одного болта (1&lt;=m1&lt;=100) соответственно. Во второй строке через пробел записаны

также три целых числа: k2, l2, m2 – начальное число гаек (100&lt;=k2&lt;=30000, k2 кратно 100),

процент потерянных деталей (0&lt;=l2&lt;=100) и стоимость одной гайки (1&lt;=m2&lt;=100)

соответственно.

Выходные данные

В выходной OUTPUT.TXT выведите одно целое число – размер ущерба.

Примеры

INPUT.TXT

1000 10 100

1200 20 90

OUTPUT.TXT

37000

INPUT.TXT

5000 15 23

4000 17 22

OUTPUT.TXT

53600