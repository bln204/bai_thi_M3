<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Danh sách cho thuê</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap5.min.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">
</head>
<body>
<div>
  <table class="table table-bordered table-striped text-center align-middle mx-auto">
    <thead>
        <tr>
          <th>Mã MB</th>
          <th>Diện tích</th>
          <th>Trạng thái</th>
          <th>Tầng</th>
          <th>Loại văn phòng</th>
          <th>Giá cho thuê</th>
          <th>Ngày bắt đầu</th>
          <th>Ngày kết thúc</th>
          <th></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="premises" item="${list}">
          <tr>
            <td><c:out value="${premises.maMatBang}"></c:out></td>
            <td><c:out value="${premises.dienTich}"></c:out></td>
            <td><c:out value="${premises.trangThai}"></c:out></td>
            <td><c:out value="${premises.tang}"></c:out></td>
            <td><c:out value="${premises.loaiVanPhong}"></c:out></td>
            <td><c:out value="${premises.giaChoThue}"></c:out></td>
            <td><c:out value="${premises.ngayBatDau}"></c:out></td>
            <td><c:out value="${premises.ngayKetThuc}"></c:out></td>
            <td>|
              <button type="button" data-id="${premises.maMatBang}">Xóa</button>
            </td>
          </tr>
        </c:forEach>
    </tbody>
  </table>
</div>




<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="deleteModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="deleteModalLabel">Xác nhận xóa</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        Bạn có chắc chắn muốn xóa mã mặt bằng <strong id="maMatBang"></strong> không?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
        <a id="confirmDelete" href="#" class="btn btn-danger">Xóa</a>
      </div>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js"></script>


<script>
  let deleteModal = document.getElementById('deleteModal');
  deleteModal.addEventListener('show.bs.modal', function (event) {
    let button = event.relatedTarget;
    let premisesId = button.getAttribute('data-id');
    let premisesCode = button.closest('tr').querySelector('td:nth-child(1)').textContent;
    let confirmDelete = document.getElementById('confirmDelete');
    let premisesCodeSpan = document.getElementById('maMatBang');

    confirmDelete.href = '?action=delete&id=' + premisesId;
    premisesCodeSpan.textContent = premisesCode;
  });
</script>


</script>
</body>
</html>